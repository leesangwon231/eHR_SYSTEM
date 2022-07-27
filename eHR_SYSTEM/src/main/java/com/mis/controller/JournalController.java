package com.mis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.JndetailVO;
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
	public void listAll(Model model, HttpSession session) throws Exception {
		MemberVO vo = new MemberVO();
		vo = (MemberVO) session.getAttribute("login");
		model.addAttribute("list", service.listAll(vo.getMemNo()));
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGet(Model model, HttpSession session) throws Exception {

		MemberVO user = new MemberVO();
		user = (MemberVO) session.getAttribute("login");
		JournalDTO dto = new JournalDTO();
		dto = service.selectAllListDTO(user.getMemNo());

		List<ScategoryVO> sVo = service.selectSlist(dto.getlNo());

		ArrayList<String> time = new ArrayList<String>();

		String setTime = "";

		for (int i = 9; i < 18; i++) {
			setTime = "0" + i + ":00 ~ " + (i + 1) + ":00";
			if (i >= 10) {
				setTime = i + ":00 ~ " + (i + 1) + ":00";
			}
			time.add(setTime);
		}

		time.add("초과근무");

		model.addAttribute("jDto", dto);
		model.addAttribute("time", time);
		model.addAttribute("sList", sVo);

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute(value = "JournalVO") JournalVO jvo,
			@ModelAttribute(value = "JndetailVO") JndetailVO dvo, RedirectAttributes rttr) throws Exception {

		System.out.println(jvo);
		System.out.println(dvo);

		System.out.println((String[]) dvo.getJnLIst().get(1).getFiles());
		service.jnRegister(jvo);

		int jnNo = service.selectJnNo(jvo);

		for (int i = 0; i < dvo.getJnLIst().size(); i++) {
			dvo.getJnLIst().get(i).setJnNo(jnNo);
			service.jndRegister(dvo.getJnLIst().get(i));
		}

		rttr.addFlashAttribute("msg", "REGISTER");

		return "redirect:/journal/list";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("jnNo") int jnNo, Model model, HttpSession session) throws Exception {

		ArrayList<String> name = new ArrayList<String>();
		List<JndetailVO> vo = service.readJournalDetail(jnNo);
		MemberVO user = new MemberVO();
		user = (MemberVO) session.getAttribute("login");
		JournalDTO dto = new JournalDTO();

		dto = service.selectAllListDTO(user.getMemNo());

		List<ScategoryVO> sVo = service.selectSlist(dto.getlNo());

		for (int i = 0; i < vo.size(); i++) {
			name.add(service.selectSname(service.readJournalDetail(jnNo).get(i).getsNo()));
		}

		ArrayList<String> time = new ArrayList<String>();

		String setTime = "";

		for (int i = 9; i < 18; i++) {
			setTime = "0" + i + ":00 ~ " + (i + 1) + ":00";
			if (i >= 10) {
				setTime = i + ":00 ~ " + (i + 1) + ":00";
			}
			time.add(setTime);
		}

		time.add("초과근무");
		

		model.addAttribute("time", time);
		model.addAttribute("sList", sVo);
		model.addAttribute("dto", service.selectAllListDTO(user.getMemNo()));
		model.addAttribute("names", name);
		model.addAttribute("J", service.readJournal(jnNo));
		model.addAttribute("JD", service.readJournalDetail(jnNo));
		model.addAttribute("jnfileVO", service.fileList(jnNo));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("jnNo") int jnNo, Model model, HttpSession session) throws Exception {

		//1) 로그인 정보가져오기
		MemberVO user = new MemberVO();
		user = (MemberVO) session.getAttribute("login");
		
		
		//2) 시간 정보 가져오기
		ArrayList<String> time = new ArrayList<String>();
		String setTime = "";

		for (int i = 9; i < 18; i++) {
			setTime = "0" + i + ":00 ~ " + (i + 1) + ":00";
			if (i >= 10) {
				setTime = i + ":00 ~ " + (i + 1) + ":00";
			}
			time.add(setTime);
		}

		time.add("초과근무");
		
		//3) 전체(사원 정보) 소분류 목록
		JournalDTO dto = new JournalDTO();
		dto = service.selectAllListDTO(user.getMemNo());
		List<ScategoryVO> sVo = service.selectSlist(dto.getlNo());
		
		//4) 업무일지에 등록한 소분류 정보
		ArrayList<String> name = new ArrayList<String>();
		List<JndetailVO> vo = service.readJournalDetail(jnNo);

		for (int i = 0; i < vo.size(); i++) {
			name.add(service.selectSname(service.readJournalDetail(jnNo).get(i).getsNo()));
		}
		

		model.addAttribute("time", time);
		model.addAttribute("dto", dto);
		model.addAttribute("sList", sVo);
		model.addAttribute("names", name);
		
		model.addAttribute("J", service.readJournal(jnNo));
		model.addAttribute("JD", service.readJournalDetail(jnNo));
		model.addAttribute("jnfileVO", service.fileList(jnNo));

	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(@ModelAttribute(value = "JournalVO") JournalVO jvo, @ModelAttribute(value = "JndetailVO") JndetailVO dvo, RedirectAttributes rttr) throws Exception {

		System.out.println(dvo);
		
		service.modify(dvo,jvo);

		rttr.addFlashAttribute("msg", "MODIFY");

		return "redirect:/journal/list";

	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("jnNo") int jnNo, RedirectAttributes rttr) throws Exception {

		service.remove(jnNo);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/journal/list";

	}

	@ResponseBody
	@RequestMapping(value = "/checkDate", method = RequestMethod.GET)
	public ResponseEntity<Integer> checkDate(@RequestParam("jnWdate") String jnWdate, Model model) throws Exception {

		ResponseEntity<Integer> entity = null;
		try {
			entity = new ResponseEntity<Integer>(service.checkDate(jnWdate), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<Integer>(HttpStatus.BAD_REQUEST);
		}
		return entity;

	}
}
