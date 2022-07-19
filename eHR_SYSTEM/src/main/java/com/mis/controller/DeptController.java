package com.mis.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.DeptVO;
import com.mis.service.DeptService;

@Controller
@RequestMapping("/dept/*")
public class DeptController {

	private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	@Inject
	private DeptService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGet() throws Exception {

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(DeptVO vo, RedirectAttributes rttr) throws Exception {

		service.register(vo);
		rttr.addFlashAttribute("msg", "REGISTER");
		logger.info("register......");
		
		return "redirect:/dept/list";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("deptNo") int deptNo, Model model)
			throws Exception {

		model.addAttribute(service.read(deptNo));

	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("deptNo") int deptNo , Model model) throws Exception {
		System.out.println(service.read(deptNo));
		model.addAttribute("DeptVO",service.read(deptNo));

	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(DeptVO vo, Model model, RedirectAttributes rttr) throws Exception {

		service.update(vo);
		rttr.addFlashAttribute("msg", "MODIFY");

		return "redirect:/dept/list";

	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String remove(@RequestParam("deptNo") int deptNo, Model model, RedirectAttributes rttr) throws Exception {

		service.delete(deptNo);

		rttr.addFlashAttribute("msg", "REMOVE");

		return "redirect:/dept/list";

	}
}
