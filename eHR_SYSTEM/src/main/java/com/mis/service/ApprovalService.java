package com.mis.service;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.dto.JournalDTO;


public interface ApprovalService {
	
	public List<JournalVO> listAll() throws Exception;
	
	public String selectName(int memNo) throws Exception;

	public JournalVO readJournal(int jnNo) throws Exception;
	
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception;
	
	public String selectSname(int sNo) throws Exception;
	
	public void approval(JournalVO vo) throws Exception;
	
	public JournalDTO selectAllListDTO(int memNo) throws Exception;
	
	public List<JnfileVO> fileList(int jndNo) throws Exception;
}
