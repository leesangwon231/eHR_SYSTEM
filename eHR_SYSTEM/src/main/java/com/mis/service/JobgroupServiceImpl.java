package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JobgroupVO;
import com.mis.persistence.JobgroupDAO;

@Service
public class JobgroupServiceImpl implements JobgroupService {

	@Inject
	private JobgroupDAO dao;

	@Override
	public void register(JobgroupVO vo) throws Exception {
		dao.create(vo);
		
	}

	@Override
	public JobgroupVO read(int jgNo) throws Exception {

		return dao.read(jgNo);
	}

	@Override
	public void modify(JobgroupVO vo) throws Exception {
		dao.update(vo);
		
	}

	@Override
	public void remove( int jgNo) throws Exception {
		dao.delete(jgNo);
		
	}

	@Override
	public List<JobgroupVO> listAll() throws Exception {
	
		return dao.listAll();
	}
	
	
}
