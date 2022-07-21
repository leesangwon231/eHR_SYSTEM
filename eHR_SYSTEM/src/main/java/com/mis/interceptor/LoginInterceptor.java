package com.mis.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mis.domain.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static final String LOGIN = "login";
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		HttpSession session = request.getSession();

		ModelMap modelMap = modelAndView.getModelMap();
		Object loginVO = modelMap.get("loginVO");
		if (loginVO != null) {
			logger.info("new login success");

			Object dest = session.getAttribute("dest");
			session.setAttribute("login", loginVO);
			MemberVO user = (MemberVO) session.getAttribute("login");
			System.out.println(user);
			String auth = user.getMemPosition();
		
			if (auth == "0")// 사용자
			{
				logger.info("adminmain...........");

				response.sendRedirect("/journal/list");

			} 
		
			else if(auth == "1") // 팀장
			{
			
				
				response.sendRedirect(dest != null ? (String) dest : "/journal/list");
				
			}
			else {
				response.sendRedirect(dest != null ? (String) dest : "/journal/list");
			}
			
			
		}

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();

		if (session.getAttribute(LOGIN) != null) {
			logger.info("clear login data before");

			session.removeAttribute(LOGIN);
		}

		return true;

	}

}
