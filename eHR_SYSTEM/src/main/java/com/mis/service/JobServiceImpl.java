package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.Criteria;
import com.mis.domain.JobVO;
import com.mis.domain.SearchCriteria;
import com.mis.persistence.JobDAO;

@Service
public class JobServiceImpl implements JobService{
	
	@Inject
	private JobDAO dao;

	@Override
	public void register(JobVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JobVO read(int jobNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(JobVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer jobNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<JobVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<JobVO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
