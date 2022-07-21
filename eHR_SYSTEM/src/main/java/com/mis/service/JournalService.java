package com.mis.service;

import java.util.List;

import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;

public interface JournalService {
	
	public void register(JournalVO vo) throws Exception;

	public JournalVO read(int jnNo) throws Exception;

	public void modify(JournalVO vo) throws Exception;

	public void remove(Integer jnNo) throws Exception;

	public List<JournalVO> listAll() throws Exception;
	
	public List<ScategoryVO> selectSlist(int lNo) throws Exception;
}
