package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.ScategoryVO;
import com.mis.persistence.ScategoryDAO;

@Service
public class ScategoryServiceImpl implements ScategoryService{
	
	@Inject
	private ScategoryDAO dao;


	@Override
	public void create(ScategoryVO vo) throws Exception {
		dao.create(vo);
		
	}

	@Override
	public ScategoryVO read(int sNo) throws Exception {
		return dao.read(sNo);
	}

	@Override
	public void update(ScategoryVO vo) throws Exception {
		dao.update(vo);
		
	}

	@Override
	public void delete(int sNo) throws Exception {
		dao.delete(sNo);
		
	}
	
	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return dao.selectJobGroup();
	}

	@Override
	public List<JobVO> selectJob(int jgNo) throws Exception {
		return dao.selectJob(jgNo);
	}

	@Override
	public List<LcategoryVO> selectLcategory(int lNo) throws Exception {
		return dao.selectLcategory(lNo);
	}

	@Override
	public List<ScategoryVO> listAll() throws Exception {
		return dao.listAll();
	}

}
