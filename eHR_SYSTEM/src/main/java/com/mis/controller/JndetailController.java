package com.mis.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.JndetailVO;
import com.mis.domain.SearchCriteria;
import com.mis.service.JndetailService;

	@Controller
	@RequestMapping("/jndetail/*")
	public class JndetailController {

		@Inject
		private JndetailService service;

		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public void registerGET() throws Exception {

		}

		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String registerPOST(JndetailVO vo, RedirectAttributes rttr) throws Exception {

			service.register(vo);
			rttr.addFlashAttribute("msg", "SUCCESS");

			return "redirect:/journal/listAll";

		}

		@RequestMapping(value = "/read", method = RequestMethod.GET)
		public void read(@RequestParam("jndNo") int jndNo, @ModelAttribute("cri") SearchCriteria cri, Model model)
				throws Exception {

			model.addAttribute(service.read(jndNo));
			
			//2)첨부 파일
			model.addAttribute("jnfileVO", service.fileList(jndNo));
			
		}
		
		@RequestMapping(value = "/modify", method = RequestMethod.GET)
		public void modifyGET(@RequestParam("jndNo") int jndNo, @ModelAttribute("cri") SearchCriteria cri, Model model)
				throws Exception {

			
			model.addAttribute(service.read(jndNo));
			
			model.addAttribute("jnfileVO", service.fileList(jndNo));
			
		}
		
		@RequestMapping(value = "/modify", method = RequestMethod.POST)
		public String modifyPOST(JndetailVO vo, @ModelAttribute("cri") SearchCriteria cri, RedirectAttributes rttr)
				throws Exception {

			//1)첨부파일도 재업로드
			service.modify(vo);
			
			return "redirect:/journal/listAll";
			
		}
		
		@RequestMapping(value = "/remove", method = RequestMethod.POST)
		public String removePOST(@RequestParam("jndNo") int jndNo, @ModelAttribute("cri") SearchCriteria cri, RedirectAttributes rttr)
				throws Exception {

			//1)삭제
			service.remove(jndNo);
			
			return "redirect:/journal/listAll";
			
		}
		
	}