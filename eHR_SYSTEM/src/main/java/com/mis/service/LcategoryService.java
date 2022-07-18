package com.mis.service;

import java.util.List;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;


public interface LcategoryService {


	public List<JobgroupVO> selectJobGroup() throws Exception;
	
	public List<JobVO> selectJob(int jgNo) throws Exception;
	
	public void register(LcategoryVO vo) throws Exception;
	
	public LcategoryVO read(int lNo) throws Exception;
	
	public void update(LcategoryVO vo) throws Exception;
	
	public void delete(int lNo) throws Exception;
	
	public List<LcategoryVO> list() throws Exception;

}
