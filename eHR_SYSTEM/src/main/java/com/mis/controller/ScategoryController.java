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
import com.mis.domain.LcategoryVO;
import com.mis.service.ScategoryService;

@Controller
@RequestMapping("/scategory/*")
public class ScategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(ScategoryController.class);

	
	@Inject
	private ScategoryService service;
	
	@RequestMapping(value="/a", method=RequestMethod.GET)
	public void listGET(Model model) throws Exception{
		model.addAttribute("jobGroup", service.selectJobGroup());
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
	
	@ResponseBody
	@RequestMapping(value="/lcList", method=RequestMethod.GET)
	public ResponseEntity<List<LcategoryVO>> lcListGET(@RequestParam("jobNo") int jobNo, Model model) throws Exception{
		
		ResponseEntity<List<LcategoryVO>> entity = null;
		try {
			entity = new ResponseEntity<List<LcategoryVO>>(service.selectLcategory(jobNo), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<List<LcategoryVO>>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
		
		
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.listAll());
	}

}
