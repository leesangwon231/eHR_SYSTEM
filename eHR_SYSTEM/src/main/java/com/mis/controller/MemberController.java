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

import com.mis.domain.MemberVO;
import com.mis.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGet(Model model) throws Exception {

		model.addAttribute("jobGroup", service.selectJobGroup());
		model.addAttribute("Dept", service.selectDept());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(MemberVO vo, RedirectAttributes rttr) throws Exception {
		System.out.println(vo);

		
		service.register(vo);
		rttr.addFlashAttribute("msg", "REGISTER");
		logger.info("register......");
		
		return "redirect:/member/list";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("memNo") int memNo, Model model)
			throws Exception {

		model.addAttribute(service.read(memNo));

	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("memNo") int memNo , Model model) throws Exception {
		
		model.addAttribute("JobGroup", service.selectJobGroup());
		model.addAttribute("Dept", service.selectDept());
		model.addAttribute("MemberVO",service.read(memNo));
		System.out.println(service.read(memNo));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(MemberVO vo, Model model, RedirectAttributes rttr) throws Exception {

		service.update(vo);
		rttr.addFlashAttribute("msg", "MODIFY");

		return "redirect:/member/list";

	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String remove(@RequestParam("memNo") int memNo, Model model, RedirectAttributes rttr) throws Exception {

		service.delete(memNo);

		rttr.addFlashAttribute("msg", "REMOVE");

		return "redirect:/member/list";

	}
}
