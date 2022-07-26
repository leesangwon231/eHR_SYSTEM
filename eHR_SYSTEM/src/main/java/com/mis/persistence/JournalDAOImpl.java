package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;

@Repository
public class JournalDAOImpl implements JournalDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.mis.mapper.JournalMapper";

	@Override
	public void jnCreate(JournalVO vo) throws Exception {
		session.insert(namespace + ".jnCreate", vo);

	}

	@Override
	public int jndCreate(JndetailVO vo) throws Exception {
		session.insert(namespace + ".jndCreate", vo);
		return vo.getJndNo();

	}

	@Override
	public JournalVO readJournal(int jnNo) throws Exception {
		return session.selectOne(namespace + ".readJournal", jnNo);
	}

	@Override
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception {
		return session.selectList(namespace + ".readJournalDetail", jnNo);
	}

	@Override
	public void jndUpdate(JndetailVO vo) throws Exception {
		session.update(namespace + ".jndUpdate", vo);

	}

	@Override
	public void delete(Integer jnNo) throws Exception {
		session.delete(namespace + ".delete", jnNo);

	}

	@Override
	public List<JournalVO> listAll(int memNo) throws Exception {
		return session.selectList(namespace + ".list", memNo);
	}

	@Override
	public List<ScategoryVO> selectSlist(int lNo) throws Exception {
		return session.selectList(namespace + ".selectSlist", lNo);
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return session.selectOne(namespace + ".selectAllListDTO", memNo);
	}

	@Override
	public int selectJnNo(JournalVO vo) throws Exception {
		return session.selectOne(namespace + ".selectJnNo", vo);
	}

	@Override
	public String selectSname(int sNo) throws Exception {
		return session.selectOne(namespace + ".selectSname", sNo);
	}

	@Override
	public void insertFile(JnfileVO vo) throws Exception {
		session.insert(namespace + ".insertFile", vo);
	}

	@Override
	public void deleteFile(int jnNo) throws Exception {
		session.delete(namespace + ".deleteFile", jnNo);
	}

	@Override
	public List<JnfileVO> fileList(int jnNo) throws Exception {
		return session.selectList(namespace + ".fileList", jnNo);
	}

	@Override
	public int checkDate(String jnWdate) throws Exception {
		return session.selectOne(namespace + ".checkDate", jnWdate);
	}

}
