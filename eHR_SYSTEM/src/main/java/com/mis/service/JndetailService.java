package com.mis.service;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;

	public interface JndetailService {

	public void register(JndetailVO vo) throws Exception;
	
	public JndetailVO read(int jndNo) throws Exception;

	public void modify(JndetailVO vo) throws Exception; 

	public void remove(int jndNo) throws Exception; 

	public List<JnfileVO> fileList(int jndNo) throws Exception;
}
