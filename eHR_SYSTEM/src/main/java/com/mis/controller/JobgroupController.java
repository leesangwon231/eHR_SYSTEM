package com.mis.controller;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.Criteria;
import com.mis.domain.JobgroupVO;
import com.mis.domain.PageMaker;
import com.mis.service.JobgroupService;

@Controller
@RequestMapping("/jobgroup/*")

public class JobgroupController {

	// private static final Logger logger =
	// LoggerFactory.getLogger(JobgroupController.class);

	@Inject
	private JobgroupService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET() throws Exception {
		// logger.info("register get......");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(JobgroupVO jobGroup, RedirectAttributes rttr) throws Exception {
		System.out.println(jobGroup);

		service.create(jobGroup.getJgName());

		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/jobgroup/list";

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {

		// logger.info("show all list..............");
		model.addAttribute("list", service.listAll());
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("jgNo") int jgNo, Model model) throws Exception {
		model.addAttribute("jgVo",service.read(jgNo));
	}

	

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int jgNo, Model model) throws Exception {
		model.addAttribute("jgVo",service.read(jgNo));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(JobgroupVO jobgroup, RedirectAttributes rttr) throws Exception {
		// logger.info("mod post............");
		
		service.modify(jobgroup);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/jobgroup/list";
	}

	// GET������� ȣ�� model�� ��Ƽ� DB���� ������
	// "/listCri" jsp ��θ� ����
	/*
	 * @RequestMapping(value = "/listCri", method = RequestMethod.GET) public void
	 * listCriGET(Criteria cri, Model model) throws Exception {
	 * model.addAttribute("list",service.listCriteria(cri)); }
	 * 
	 * @RequestMapping(value="/listPage" ,method=RequestMethod.GET) public void
	 * listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
	 * 
	 * model.addAttribute("list",service.listCriteria(cri)); PageMaker pageMaker =
	 * new PageMaker(); pageMaker.setCri(cri);
	 * pageMaker.setTotalCount(service.listCountCriteria(cri));
	 * model.addAttribute("pageMaker", pageMaker);
	 * 
	 * }
	 */

}
