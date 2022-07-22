package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;
import com.mis.persistence.LcategoryDAO;

@Service
public class LcategoryServiceImpl implements LcategoryService{
	
	@Inject
	private LcategoryDAO dao;

	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return dao.selectJobGroup();
	}

	@Override
	public List<JobVO> selectJob(int jgNo) throws Exception {
		return dao.selectJob(jgNo);
	}

	@Override
	public void register(LcategoryVO vo) throws Exception {
		dao.register(vo);
	}

	@Override
	public LcategoryVO read(int lNo) throws Exception {
		return dao.read(lNo);
	}

	@Override
	public void update(LcategoryVO vo) throws Exception {
		dao.update(vo);
	}


	@Override
	public List<LcategoryVO> list() throws Exception {
		return dao.list();
	}
	
	
	

}
