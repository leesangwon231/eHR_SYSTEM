package com.mis.persistence;

import java.util.List;

import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;

public interface JournalDAO {

	public void create(JournalVO vo) throws Exception;

	public JournalVO read(int jnNo) throws Exception;

	public void update(JournalVO vo) throws Exception;

	public void delete(Integer jnNo) throws Exception;

	public List<JournalVO> listAll() throws Exception;
	
	public List<ScategoryVO> selectSlist(int lNo) throws Exception;
	
	public JournalDTO selectAllListDTO(int memNo) throws Exception;

}
