package com.mis.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void getTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	
/*	
	@Test 
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user02");
		vo.setUserpw("user02");
		vo.setUsername("USER02");
		vo.setEmail("user01@aaa.com");
		dao.insertMember(vo);
	}

	*/
	
	@Test
	public void selectMember() throws Exception{
		
		MemberVO vo = dao.readMember("user02");
		System.out.println(vo);
		
	}
	
	
	@Test
	public void readWithPW() throws Exception{
		
		MemberVO vo = dao.readWithPW("user02", "user02");
		System.out.println(vo);
		
	}
	
	
	
}
