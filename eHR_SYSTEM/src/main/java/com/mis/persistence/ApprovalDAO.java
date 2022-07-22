package com.mis.persistence;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JournalVO;
import com.mis.dto.JournalDTO;

public interface ApprovalDAO {

	public List<JournalVO> listAll() throws Exception;
	
	public String selectName(int memNo) throws Exception;
	
	public JournalDTO selectAllDTO(int jnNo) throws Exception;
	
	public JournalVO readJournal(int jnNo) throws Exception;
	
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception;
	
	


}
