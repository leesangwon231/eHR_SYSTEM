package com.mis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.JndetailVO;
import com.mis.domain.JournalVO;
import com.mis.domain.MemberVO;
import com.mis.dto.JournalDTO;
import com.mis.service.ApprovalService;
import com.mis.service.JournalService;

@Controller
@RequestMapping("/approval/*")
public class ApprovalController {

	@Inject
	private ApprovalService service;
	
	@Inject
	private JournalService service2;
	
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
	public void read(@RequestParam("jnNo") int jnNo, Model model, HttpSession session)
			throws Exception {
		
		ArrayList<String> name = new ArrayList<String>();
		List<JndetailVO> vo = service.readJournalDetail(jnNo);
		MemberVO user = new MemberVO();
		user = (MemberVO) session.getAttribute("login");
		
		for (int i = 0; i < vo.size(); i++) {
			name.add(service.selectSname(service.readJournalDetail(jnNo).get(i).getsNo()));
		}
		
		
		
		model.addAttribute("dto",service2.selectAllListDTO(user.getMemNo()));
		model.addAttribute("names",name);
		model.addAttribute("J", service.readJournal(jnNo));
		model.addAttribute("JD", service.readJournalDetail(jnNo));
	

	}
	
	@RequestMapping(value = "/read", method = RequestMethod.POST)
	public String readPost(JournalVO vo, RedirectAttributes rttr) throws Exception {
		
		
		service.approval(vo);
		rttr.addFlashAttribute("msg", "MODIFY");
		
		return "redirect:/approval/list";

	}
	
}
