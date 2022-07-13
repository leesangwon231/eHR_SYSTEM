package com.mis.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession SqlSession;

	private static final String namespace = "com.mis.mapper.MemberMapper";

	@Override
	public String getTime() {
			
		return SqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		SqlSession.insert(namespace+".insertMember",vo);

	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		
		return SqlSession.selectOne(namespace+".selectMember",userid);
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return SqlSession.selectOne(namespace+".readWithPW",paramMap);
	}

}
