package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.Criteria;
import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.SearchCriteria;
import com.mis.persistence.JobDAO;

@Service
public class JobServiceImpl implements JobService {

	@Inject
	private JobDAO dao;
	
	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return dao.selectJobGroup();
	}

	@Override
	public void register(JobVO vo) throws Exception {
		dao.create(vo);

	}

	@Override
	public JobVO read(int jobNo) throws Exception {
		return dao.read(jobNo);
	}

	@Override
	public void modify(JobVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void remove(Integer jobNo) throws Exception {
		dao.delete(jobNo);
	}

	@Override
	public List<JobVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<JobVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.listCountCriteria(cri);
	}

	@Override
	public List<JobVO> listSearch(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}


}
