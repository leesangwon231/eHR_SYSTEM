package com.mis.persistence;

import java.util.List;

import com.mis.domain.JobgroupVO;

public interface JobgroupDAO {
	
	
	public void create(JobgroupVO vo) throws Exception;

	public JobgroupVO read(int jgNo) throws Exception;

	public void update(JobgroupVO vo) throws Exception;

	public void delete(Integer jgNo) throws Exception;

	public List<JobgroupVO> listAll() throws Exception;

}
