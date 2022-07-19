package com.mis.persistence;

import java.util.List;

import com.mis.domain.JournalVO;

public interface JournalDAO {

	public void create(JournalVO vo) throws Exception;

	public JournalVO read(int jnNo) throws Exception;

	public void update(JournalVO vo) throws Exception;

	public void delete(Integer jnNo) throws Exception;

	public List<JournalVO> listAll() throws Exception;

}
