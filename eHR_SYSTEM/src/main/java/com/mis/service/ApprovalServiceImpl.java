package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.dto.JournalDTO;
import com.mis.persistence.ApprovalDAO;

@Service
public class ApprovalServiceImpl implements ApprovalService {

	@Inject
	private ApprovalDAO dao;

	@Override
	public List<JournalVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public String selectName(int memNo) throws Exception {
		return dao.selectName(memNo);
	}

	@Override
	public JournalVO readJournal(int jnNo) throws Exception {
		return dao.readJournal(jnNo);
	}

	@Override
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception {
		return dao.readJournalDetail(jnNo);
	}

	@Override
	public String selectSname(int sNo) throws Exception {
		return dao.selectSname(sNo);
	}

	@Override
	public void approval(JournalVO vo) throws Exception {
			dao.approval(vo);
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return dao.selectAllListDTO(memNo);
	}

	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return dao.fileList(jndNo);
	}
	
	
}
