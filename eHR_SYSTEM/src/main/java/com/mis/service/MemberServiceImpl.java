package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.mis.domain.DeptVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@Repository
public class MemberServiceImpl implements MemberService {

	 @Inject
	private MemberDAO dao;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);
		
	}

	@Override
	public MemberVO read(int deptNo) throws Exception {
		return dao.read(deptNo);
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void delete(int memNo) throws Exception {
		dao.delete(memNo);
		
	}

	@Override
	public List<MemberVO> list() throws Exception {
		return dao.list();
	}

	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return dao.selectJobGroup();
	}

	@Override
	public List<DeptVO> selectDept() throws Exception {
		return dao.selectDept();
	}	
}
