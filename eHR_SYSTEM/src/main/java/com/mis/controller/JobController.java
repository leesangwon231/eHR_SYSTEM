package com.mis.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.JobVO;
import com.mis.service.JobService;

@Controller
@RequestMapping("/job/*")
public class JobController {

	@Inject
	private JobService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.listAll());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(Model model) throws Exception {
		model.addAttribute("jobGroup", service.selectJobGroup());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(RedirectAttributes rttr, JobVO vo) throws Exception {
		
		service.register(vo);
		rttr.addFlashAttribute("msg", "REGISTER");

		return "redirect:/job/list";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("jobNo") int jobNo, Model model) throws Exception {

		model.addAttribute("jobVo", service.read(jobNo));

	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("jobNo") int jobNo, Model model) throws Exception {
		
		model.addAttribute("jobGroup", service.selectJobGroup());
		model.addAttribute("jobVo", service.read(jobNo));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(JobVO vo, Model model, RedirectAttributes rttr) throws Exception {
		service.modify(vo);

		rttr.addFlashAttribute("msg", "MODIFY");

		return "redirect:/job/list";
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String deletePOST(@RequestParam("jobNo") int jobNo, Model model, RedirectAttributes rttr) throws Exception {

		service.remove(jobNo);

		rttr.addFlashAttribute("msg", "REMOVE");

		return "redirect:/job/list";
	}
}
