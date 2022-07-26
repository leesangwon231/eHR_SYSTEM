package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.dto.JournalDTO;

@Repository
public class ApprovalDAOImpl implements ApprovalDAO{
	
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.ApprovalMapper";

	@Override
	public List<JournalVO> listAll() throws Exception {
		return session.selectList(namespace+".list");
	}

	@Override
	public String selectName(int memNo) throws Exception {
		return session.selectOne(namespace+".selectName",memNo);
	}

	@Override
	public JournalDTO selectAllDTO(int jnNo) throws Exception {
		return session.selectOne(namespace+".selectAllDTO",jnNo);
	}

	@Override
	public JournalVO readJournal(int jnNo) throws Exception {
		return session.selectOne(namespace+".readJournal",jnNo);
	}

	@Override
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception {
		return session.selectList(namespace+".readJournalDetail",jnNo);
	}

	@Override
	public String selectSname(int sNo) throws Exception {
		return session.selectOne(namespace+".selectSname",sNo);
	}

	@Override
	public void approval(JournalVO vo) throws Exception {
		 session.update(namespace+".approval", vo);
		
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return session.selectOne(namespace + ".selectAllListDTO", memNo);
	}

	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return session.selectList(namespace + ".fileList", jndNo);
	}

}
