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

import com.mis.domain.JobVO;
import com.mis.service.LcategoryService;

@Controller
@RequestMapping("/lcategory/*")
public class LcategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(LcategoryController.class);
	
	@Inject
	private LcategoryService service;
	
	@RequestMapping(value="/a", method=RequestMethod.GET)
	public void listGET(Model model) throws Exception{
		model.addAttribute("jobGroup", service.selectJobGroup());
		logger.info("register GET .......");
	}
	
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
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register(Model model) throws Exception {
		
	}
	/*
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public String listPOST(BoardVO vo , RedirectAttributes rttr) throws Exception{
		logger.info("register POST .......");
		
		service.register(vo);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/listAll";
	}
	
	*/
}
