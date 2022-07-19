package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.mis.domain.DeptVO;
import com.mis.persistence.DeptDAO;

@Repository
public class DeptServiceImpl implements DeptService {

	@Inject
	private DeptDAO dao;
	
	@Override
	public void register(DeptVO vo) throws Exception {
		dao.register(vo);
		
	}

	@Override
	public DeptVO read(int deptNo) throws Exception {
		return dao.read(deptNo);
	}

	@Override
	public void update(DeptVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void delete(int deptNo) throws Exception {
		dao.delete(deptNo);
		
	}

	@Override
	public List<DeptVO> list() throws Exception {
		return dao.list();
	}

}
