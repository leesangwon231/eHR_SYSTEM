package com.mis.service;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JournalVO;


public interface ApprovalService {
	
	public List<JournalVO> listAll() throws Exception;
	
	public String selectName(int memNo) throws Exception;

	public JournalVO readJournal(int jnNo) throws Exception;
	
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception;
}
