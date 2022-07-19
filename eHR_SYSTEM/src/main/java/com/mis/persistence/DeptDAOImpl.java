package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.DeptVO;

@Repository
public class DeptDAOImpl implements DeptDAO  {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.DeptMapper";

	
	@Override
	public void register(DeptVO vo) throws Exception {
		session.insert(namespace + ".register", vo);
		
	}

	@Override
	public DeptVO read(int deptNo) throws Exception {
		return session.selectOne(namespace + ".read", deptNo);
	}

	@Override
	public void update(DeptVO vo) throws Exception {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(int deptNo) throws Exception {
		session.delete(namespace + ".delete", deptNo);
		
	}

	@Override
	public List<DeptVO> list() throws Exception {
		return session.selectList(namespace + ".list");
	}

}
