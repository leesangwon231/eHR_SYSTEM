package com.mis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mis.domain.JournalVO;
import com.mis.service.ApprovalService;

@Controller
@RequestMapping("/approval/*")
public class ApprovalController {

	@Inject
	private ApprovalService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		
		ArrayList<String> name = new ArrayList<String>();
		List<JournalVO> vo = service.listAll();
		
	
		for (int i = 0; i < vo.size(); i++) {
			name.add(service.selectName(vo.get(i).getMemNo()));
		}
		
		model.addAttribute("names",name);
		model.addAttribute("list", service.listAll());
	}
	
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("jnNo") int jnNo, Model model)
			throws Exception {
	
		System.out.println("J=======>"+service.readJournal(jnNo));
		System.out.println("JD=======>"+service.readJournalDetail(jnNo));
		model.addAttribute("J", service.readJournal(jnNo));
		model.addAttribute("JD", service.readJournalDetail(jnNo));
	

	}
	
}
