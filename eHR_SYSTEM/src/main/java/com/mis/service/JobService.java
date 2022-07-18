package com.mis.service;

import java.util.List;

import com.mis.domain.Criteria;
import com.mis.domain.JobVO;
import com.mis.domain.SearchCriteria;

public interface JobService {
	
	public void register(JobVO vo) throws Exception;

	public JobVO read(int jobNo) throws Exception;

	public void modify(JobVO vo) throws Exception;

	public void remove(Integer jobNo) throws Exception;

	public List<JobVO> listAll() throws Exception;

	public List<JobVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<JobVO> listSearch(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

}
