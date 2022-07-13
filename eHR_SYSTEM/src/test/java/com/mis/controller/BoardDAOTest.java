package com.mis.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	@Inject
	private BoardDAO dao;
	
	
	/*@Test
	public void create() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setContent("11");
		vo.setTitle("22");
		vo.setWriter("33");
		dao.create(vo);
	}
	
	
	@Test
	public void read() throws Exception{
		BoardVO vo = dao.read(5);
		System.out.println(vo);
	}
	
	
	@Test
	public void update() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("change 11");
		vo.setContent("change 22");
		vo.setWriter("change 33");
		vo.setBno(5);
		dao.update(vo);
		System.out.println("update.....");
	}
	
	
	
	@Test
	public void delete() throws Exception{
		dao.delete(5);
	}
	
	
	@Test
	public void allList() throws Exception{
		ArrayList<BoardVO> bVo = (ArrayList<BoardVO>) dao.listAll();
		
		for (BoardVO boardVO : bVo) {
			System.out.println(boardVO);
		}
	}
	

	
	@Test
	public void listCriteria() throws Exception{
		Criteria cri = new Criteria();
		ArrayList<BoardVO> bVo = (ArrayList<BoardVO>) dao.listCriteria(cri);
		for (BoardVO boardVO : bVo) {
			System.out.println(boardVO);
		}
	}
		
	@Test
	public void listCountCriteria() throws Exception{
		Criteria cri = new Criteria();
		int a = dao.listCountCriteria(cri);
		System.out.println("d=======>"+a);
	}
	*/
}
