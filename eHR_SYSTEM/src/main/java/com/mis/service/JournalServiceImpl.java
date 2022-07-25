package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;
import com.mis.persistence.JournalDAO;

@Service
public class JournalServiceImpl implements JournalService {

	@Inject
	private JournalDAO dao;

	@Override
	public void jnRegister(JournalVO vo) throws Exception {
		dao.jnCreate(vo);

	}

	@Override
	public void jndRegister(JndetailVO vo) throws Exception {
		int jndNo = dao.jndCreate(vo);
		System.out.println(jndNo);
		if (vo.getFiles() != null) {

			// 3-2) ���� ÷������ ����
			for (int i = 0; i < vo.getFiles().length; i++) {

				JnfileVO fVo = new JnfileVO();
				fVo.setJndNo(jndNo); // �������� ���̺� PK (FK)
				fVo.setJnfileName(vo.getFiles()[i]); // ���ε�� ÷�����ϸ�

				dao.insertFile(fVo);

			}

		}

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
	public void modify(JournalVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void remove(Integer jnNo) throws Exception {
		dao.delete(jnNo);
	}

	@Override
	public List<JournalVO> listAll(int memNo) throws Exception {
		return dao.listAll(memNo);
	}

	@Override
	public List<ScategoryVO> selectSlist(int lNo) throws Exception {
		return dao.selectSlist(lNo);
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return dao.selectAllListDTO(memNo);
	}

	@Override
	public int selectJnNo(JournalVO vo) throws Exception {
		return dao.selectJnNo(vo);
	}

	@Override
	public String selectSname(int sNo) throws Exception {
		return dao.selectSname(sNo);
	}

	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return dao.fileList(jndNo);
	}

	@Override
	public int checkDate(String jnWdate) throws Exception {
		return dao.checkDate(jnWdate);
	}

}
