package com.mis.persistence;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;

public interface JndetailDAO {

	public void create(JndetailVO vo) throws Exception;

	public JndetailVO read(int jndNo) throws Exception;

	public void update(JndetailVO vo) throws Exception;

	public void delete(int jndNo) throws Exception;

	public void insertFile(JnfileVO jnfileNo) throws Exception;

	public void deleteFile(int jndNo) throws Exception;
	
	public List<JnfileVO> fileList(int jndNo) throws Exception;
}
