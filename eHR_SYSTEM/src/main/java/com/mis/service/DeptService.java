package com.mis.service;

import java.util.List;

import com.mis.domain.DeptVO;

public interface DeptService {

	public void register(DeptVO vo) throws Exception;
	
	public DeptVO read(int deptNo) throws Exception;
	
	public void update(DeptVO vo) throws Exception;
	
	public void delete(int deptNo) throws Exception;
	
	public List<DeptVO> list() throws Exception;
}
