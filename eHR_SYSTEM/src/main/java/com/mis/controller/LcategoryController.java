package com.mis.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.mis.domain.LcategoryVO;
import com.mis.service.LcategoryService;

@Controller
@RequestMapping("/lcategory/*")
public class LcategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(LcategoryController.class);
	
	@Inject
	private LcategoryService service;
	
	@ResponseBody
	@RequestMapping(value="/jobList", method=RequestMethod.GET)
	public ResponseEntity<List<JobVO>> jobListGET(@RequestParam("jgNo") int jgNo, Model model) throws Exception{
		
		ResponseEntity<List<JobVO>> entity = null;
		try {
			entity = new ResponseEntity<List<JobVO>>(service.selectJob(jgNo), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<List<JobVO>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
		
		
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.list());
		logger.info("list get......");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(Model model) throws Exception {
		model.addAttribute("jobGroup", service.selectJobGroup());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(RedirectAttributes rttr , LcategoryVO vo) throws Exception {
			service.register(vo);
			rttr.addFlashAttribute("msg", "REGISTER");

			return "redirect:/lcategory/list";
		
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("lNo") int lNo, Model model)
			throws Exception {

		model.addAttribute("lVo", service.read(lNo));
		
		
	}
	
	@RequestMapping(value="/modify" , method = RequestMethod.GET)
	public void modifyGET(@RequestParam("lNo") int lNo , Model model) throws Exception{
		System.out.println(service.read(lNo));
		model.addAttribute("jobGroup", service.selectJobGroup());
		model.addAttribute("lVo", service.read(lNo));
	}
	
	@RequestMapping(value="/modify" , method = RequestMethod.POST)
	public String modifyPOST(LcategoryVO vo , Model model, RedirectAttributes rttr) throws Exception{
		service.update(vo);
		
		rttr.addFlashAttribute("msg", "MODIFY");
		
		return "redirect:/lcategory/list";
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.POST)
	public String deletePOST(@RequestParam("lNo") int lNo, Model model, RedirectAttributes rttr) throws Exception{
		
		service.delete(lNo);
		
		rttr.addFlashAttribute("msg", "REMOVE");
		
		return "redirect:/lcategory/list";
	}
	
}
