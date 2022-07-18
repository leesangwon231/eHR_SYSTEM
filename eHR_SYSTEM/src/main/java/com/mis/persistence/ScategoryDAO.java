package com.mis.persistence;

import java.util.List;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.ScategoryVO;

public interface ScategoryDAO {
	
	public void create(ScategoryVO vo) throws Exception; // 등록
	
	public ScategoryVO read(int sNo) throws Exception; // 상세보기 
	
	public void update(ScategoryVO vo) throws Exception; // 수정
	
	public void delete(int sNo) throws Exception; // 삭제
	
	public List<ScategoryVO> listAll() throws Exception; // 리스트

	
	
	public List<JobgroupVO> selectJobGroup() throws Exception; //직군

	public List<JobVO> selectJob(int jgNo) throws Exception; //직종

	public List<LcategoryVO> selectLcategory(int lNo) throws Exception; //대분류

}
