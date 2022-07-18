package com.mis.persistence;

import java.util.List;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.ScategoryVO;

public interface ScategoryDAO {
	
	public void create(ScategoryVO vo) throws Exception; // ���
	
	public ScategoryVO read(int sNo) throws Exception; // �󼼺��� 
	
	public void update(ScategoryVO vo) throws Exception; // ����
	
	public void delete(int sNo) throws Exception; // ����
	
	public List<ScategoryVO> listAll() throws Exception; // ����Ʈ

	
	
	public List<JobgroupVO> selectJobGroup() throws Exception; //����

	public List<JobVO> selectJob(int jgNo) throws Exception; //����

	public List<LcategoryVO> selectLcategory(int lNo) throws Exception; //��з�

}