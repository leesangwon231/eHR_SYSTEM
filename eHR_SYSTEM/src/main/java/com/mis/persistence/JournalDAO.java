package com.mis.persistence;

import java.util.List;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;

public interface JournalDAO {

	public void jnCreate(JournalVO vo) throws Exception;

	public int jndCreate(JndetailVO vo) throws Exception;

	public JournalVO readJournal(int jnNo) throws Exception;

	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception;

	public String selectSname(int sNo) throws Exception;

	public void jndUpdate(JndetailVO vo) throws Exception;

	public void delete(Integer jnNo) throws Exception;

	public List<JournalVO> listAll(int memNo) throws Exception;

	public List<ScategoryVO> selectSlist(int lNo) throws Exception;

	public JournalDTO selectAllListDTO(int memNo) throws Exception;

	public int selectJnNo(JournalVO vo) throws Exception;

	public void insertFile(JnfileVO fvo) throws Exception;

	public void deleteFile(int jnNo) throws Exception;

	public List<JnfileVO> fileList(int jnNo) throws Exception;

	public int checkDate(String jnWdate) throws Exception;

}
