package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JobgroupVO;

@Repository

public class JobgroupDAOImpl implements JobgroupDAO {
	
	@Inject
	
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.JobgroupMapper";
	
	
	@Override
	public void create(String jgName) throws Exception {
		session.insert(namespace + ".create", jgName);
		
	}

	@Override
	public JobgroupVO read(int jgNo) throws Exception {
		return session.selectOne(namespace + ".read", jgNo);
	}

	@Override
	public void update(JobgroupVO vo) throws Exception {
		session.update(namespace + ".update", vo);
		
	}

	

	@Override
	public List<JobgroupVO> listAll() throws Exception {
		
		return session.selectList(namespace + ".listAll");
	}

}
