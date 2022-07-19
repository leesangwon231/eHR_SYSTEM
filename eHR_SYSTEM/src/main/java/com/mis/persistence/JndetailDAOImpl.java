package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;

@Repository
public class JndetailDAOImpl implements JndetailDAO {
	
	@Inject
	private SqlSession session;

	private static final String namespace = "com.mis.mapper.JndetailMapper";

	@Override
	public int create(JndetailVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
		return vo.getJndNo();
	}

	@Override
	public JndetailVO read(int jndNo) throws Exception {
		return session.selectOne(namespace + ".read", jndNo);
	}

	@Override
	public void update(JndetailVO vo) throws Exception {
		session.update(namespace + ".uppdate", vo);
		
	}

	@Override
	public void delete(int jndNo) throws Exception {
		session.delete(namespace + ".delete", jndNo);
		
	}

	@Override
	public void insertFile(JnfileVO jnfileNo) throws Exception {
		session.insert(namespace + ".insertFile", jnfileNo);
		
	}

	@Override
	public void deleteFile(int jndNo) throws Exception {
		session.delete(namespace + ".deleteFile", jndNo);
		
	}

	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return session.selectList(namespace + ".fileList", jndNo);
	}
	
}
