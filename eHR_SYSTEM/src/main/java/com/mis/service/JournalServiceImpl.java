package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;
import com.mis.persistence.JournalDAO;

@Service
public class JournalServiceImpl implements JournalService {

	@Inject
	private JournalDAO dao;

	@Override
	public void register(JournalVO vo) throws Exception {
		dao.create(vo);

	}

	@Override
	public JournalVO read(int jnNo) throws Exception {
		return dao.read(jnNo);
	}

	@Override
	public void modify(JournalVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void remove(Integer jnNo) throws Exception {
		dao.delete(jnNo);
	}

	@Override
	public List<JournalVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<ScategoryVO> selectSlist(int lNo) throws Exception {
		return dao.selectSlist(lNo);
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return dao.selectAllListDTO(memNo);
	}

}
