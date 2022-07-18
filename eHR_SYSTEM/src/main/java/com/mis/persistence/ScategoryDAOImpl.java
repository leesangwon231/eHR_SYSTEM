package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.ScategoryVO;

@Repository
public class ScategoryDAOImpl implements ScategoryDAO{
	
	@Inject
	private SqlSession session;

	private static final String namespace = "com.mis.mapper.ScategoryMapper";


	@Override
	public void create(ScategoryVO vo) throws Exception {
		session.insert(namespace+".create", vo);
		
	}

	@Override
	public ScategoryVO read(int sNo) throws Exception {
		return session.selectOne(namespace + ".read", sNo);
	}

	@Override
	public void update(ScategoryVO vo) throws Exception {
		session.update(namespace+".update", vo);
		
	}

	@Override
	public void delete(int sNo) throws Exception {
		session.delete(namespace + ".delete", sNo);		
	}
	
	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return session.selectList(namespace+".selectJobGroup");
	}

	@Override
	public List<JobVO> selectJob(int jgNo) throws Exception {
		return session.selectList(namespace+".selectJob", jgNo);
	}

	@Override
	public List<LcategoryVO> selectLcategory(int jobNo) throws Exception {
		return session.selectList(namespace+".selectLcategory",jobNo);
	}

	@Override
	public List<ScategoryVO> listAll() throws Exception {
		return session.selectList(namespace + ".list");
	}

}
