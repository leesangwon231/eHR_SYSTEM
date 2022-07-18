package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.Criteria;
import com.mis.domain.JobVO;
import com.mis.domain.SearchCriteria;

@Repository
public class JobDAOImpl implements JobDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.JobMapper";

	@Override
	public void create(JobVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
		
	}

	@Override
	public JobVO read(int jobNo) throws Exception {
		return session.selectOne(namespace + ".read", jobNo);
	}

	@Override
	public void update(JobVO vo) throws Exception {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(Integer jobNo) throws Exception {
		session.delete(namespace + ".delete", jobNo);
		
	}

	@Override
	public List<JobVO> listAll() throws Exception {
		return session.selectList(namespace + ".list");
	}

	@Override
	public List<JobVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".listCountCriteria", cri);
	}

	@Override
	public List<JobVO> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

}
