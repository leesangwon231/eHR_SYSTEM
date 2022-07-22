package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.DeptVO;
import com.mis.domain.LcategoryVO;
import com.mis.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO  {

	 @Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.MemberMapper";

	
	@Override
	public void register(MemberVO vo) throws Exception {
		session.insert(namespace + ".register", vo);
		
	}

	@Override
	public MemberVO read(int memNo) throws Exception {
		return session.selectOne(namespace + ".read", memNo);
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(int memNo) throws Exception {
		session.delete(namespace + ".delete", memNo);
		
	}

	@Override
	public List<MemberVO> list() throws Exception {
		return session.selectList(namespace + ".list");
	}

	@Override
	public List<LcategoryVO> selectLcategory() throws Exception {
		return session.selectList(namespace+".selectLcategory");
	}

	@Override
	public List<DeptVO> selectDept() throws Exception {
		return session.selectList(namespace+".selectDept");
	}

}
