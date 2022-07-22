package com.mis.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.Criteria;
import com.mis.domain.JournalVO;
import com.mis.domain.MemberVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;
import com.mis.service.JournalService;

@Controller
@RequestMapping("/journal/*")
public class JournalController {

	@Inject
	private JournalService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", service.listAll());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGet( Model model, HttpSession session) throws Exception {
		
		
		MemberVO vo = new MemberVO();
		vo = (MemberVO) session.getAttribute("login");
		JournalDTO dto = new JournalDTO();
		dto = service.selectAllListDTO(vo.getMemNo());
		
		
		List<ScategoryVO> sVo =  service.selectSlist(dto.getlNo()); 
		
		model.addAttribute("jDto",dto);
		model.addAttribute("sList", sVo);
		
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(JournalVO vo, RedirectAttributes rttr) throws Exception {

		service.register(vo);
		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/journal/list";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void readPage(@RequestParam("jnNo") int jnNo, @ModelAttribute("cri") Criteria cri, Model model)
			throws Exception {

		model.addAttribute(service.read(jnNo));

	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyPageGET(int jnNo, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {

		model.addAttribute(service.read(jnNo));

	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPagePOST(JournalVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {

		service.modify(vo);
	/*	rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());*/
		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/journal/list";

	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("jnNo") int jnNo, RedirectAttributes rttr) throws Exception {

		service.remove(jnNo);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/journal/list";

	}
}
