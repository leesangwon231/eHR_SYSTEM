package com.mis.service;

import java.util.List;

import com.mis.domain.JobgroupVO;

public interface JobgroupService {
	
	public void create(String jgName) throws Exception;
	
	public JobgroupVO read(int jgNo) throws Exception;
	
	public void modify(JobgroupVO vo) throws Exception;
	
	public void remove(int jgNo) throws Exception;
	
	public List<JobgroupVO> listAll() throws Exception;
	

}
