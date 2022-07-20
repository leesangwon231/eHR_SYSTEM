package com.mis.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String LOGINPOST(Model model , LoginDTO dto, HttpSession session, RedirectAttributes rttr ) throws Exception {
		
		MemberVO vo = service.login(dto);
		if(vo == null) {
			
				rttr.addFlashAttribute("msg", "로그인 정보가 일치 하지 않습니다.");
				return "redirect:/user/login";	
			
		}
		model.addAttribute("loginVO",vo);
		return "/user/loginPost";
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
