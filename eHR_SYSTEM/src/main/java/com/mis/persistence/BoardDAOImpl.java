package com.mis.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession SqlSession;

	private static final String namespace="com.mis.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		SqlSession.insert(namespace+".create", vo);
		
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return SqlSession.selectOne(namespace+".read",bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		SqlSession.update(namespace+".update",vo);
		
	}

	@Override
	public void delete(int bno) throws Exception {
		SqlSession.delete(namespace+".delete",bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		ArrayList<BoardVO> vo = new ArrayList<BoardVO>();
		return SqlSession.selectList(namespace+".allList",vo);
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {		
		return SqlSession.selectList(namespace+".listCriteria",cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return SqlSession.selectOne(namespace+".listCountCriteria",cri);
	}

	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return SqlSession.selectList(namespace+".listSearchCriteria",cri);
	}

	@Override
	public int listSearchCountCriteria(SearchCriteria cri) throws Exception {
		return SqlSession.selectOne(namespace+".listSearchCountCriteria",cri);
	}



}
