package com.mis.service;

import java.util.List;

import com.mis.domain.DeptVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.MemberVO;

public interface MemberService {

	 public void register(MemberVO vo) throws Exception;
	
	public MemberVO read(int memNo) throws Exception;
	
	public void update(MemberVO vo) throws Exception;
	
	public void delete(int memNo) throws Exception;
	
	public List<MemberVO> list() throws Exception;
	
	public List<LcategoryVO> selectLcategory() throws Exception;
	
	public List<DeptVO> selectDept() throws Exception;
}
