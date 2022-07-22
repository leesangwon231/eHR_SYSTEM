package com.mis.service;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;

public interface JournalService {
	
	public void jnRegister(JournalVO vo) throws Exception;
	
	public void jndRegister(JndetailVO vo) throws Exception;

	public JournalVO read(int jnNo) throws Exception;

	public void modify(JournalVO vo) throws Exception;

	public void remove(Integer jnNo) throws Exception;

	public List<JournalVO> listAll(int memNo) throws Exception;
	
	public List<ScategoryVO> selectSlist(int lNo) throws Exception;
	
	public JournalDTO selectAllListDTO(int memNo) throws Exception;
	
	public int selectJnNo(JournalVO vo) throws Exception;
}
