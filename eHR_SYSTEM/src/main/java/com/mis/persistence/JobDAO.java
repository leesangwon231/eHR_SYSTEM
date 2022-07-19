package com.mis.persistence;

import java.util.List;

import com.mis.domain.Criteria;
import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.SearchCriteria;

public interface JobDAO {
	
	public List<JobgroupVO> selectJobGroup() throws Exception;

	public void create(JobVO vo) throws Exception;

	public JobVO read(int jobNo) throws Exception;

	public void update(JobVO vo) throws Exception;

	public void delete(Integer jobNo) throws Exception;

	public List<JobVO> listAll() throws Exception;

	public List<JobVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<JobVO> listSearch(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

}
