package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;

@Repository
public class JournalDAOImpl implements JournalDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.JournalMapper";

	@Override
	public void create(JournalVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
		
	}

	@Override
	public JournalVO read(int jnNo) throws Exception {
		return session.selectOne(namespace + ".read", jnNo);
	}

	@Override
	public void update(JournalVO vo) throws Exception {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(Integer jnNo) throws Exception {
		session.delete(namespace + ".delete", jnNo);
		
	}

	@Override
	public List<JournalVO> listAll() throws Exception {
		return session.selectList(namespace + ".list");
	}

	@Override
	public List<ScategoryVO> selectSlist(int lNo) throws Exception {
		return session.selectList(namespace+".selectSlist",lNo);
	}

}
