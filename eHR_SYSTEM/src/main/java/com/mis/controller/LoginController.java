package com.mis.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mis.domain.MemberVO;
import com.mis.dto.LoginDTO;
import com.mis.service.LoginService;

@Controller
@RequestMapping("/user/*")
public class LoginController {

	@Inject
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(Model model) throws Exception {
		
	}
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void LOGINPOST(Model model , LoginDTO dto, HttpSession session ) throws Exception {
		
		MemberVO vo = service.login(dto);

		if(vo==null) {
			return;
		}
		model.addAttribute("loginVO",vo);
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {

		Object MemberVO = session.getAttribute("login");

		if (MemberVO != null) {

			session.removeAttribute("login");
			session.invalidate();

		}

		return "redirect:/";

	}
	

	
}
