package com.mis.persistence;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;
import com.mis.domain.LcategoryVO;

@Repository
public class LcategoryDAOImpl implements LcategoryDAO{

	@Inject
	private SqlSession SqlSession;

	private static final String namespace = "com.mis.mapper.LcategoryMapper";

	@Override
	public List<JobgroupVO> selectJobGroup() throws Exception {
		return SqlSession.selectList(namespace+".selectJobGroup");
	}

	@Override
	public List<JobVO> selectJob(int jgNo) throws Exception {
		return SqlSession.selectList(namespace+".selectJob",jgNo);
	}

	@Override
	public void register(LcategoryVO vo) throws Exception {
		SqlSession.insert(namespace+".register",vo);
		
	}

	@Override
	public LcategoryVO read(int lNo) throws Exception {
		return SqlSession.selectOne(namespace+".read",lNo);
	}

	@Override
	public void update(LcategoryVO vo) throws Exception {
		 SqlSession.update(namespace+".update", vo);
	}



	@Override
	public List<LcategoryVO> list() throws Exception {
		return SqlSession.selectList(namespace+".list");
	}

	

}
