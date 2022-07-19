package com.mis.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.MemberVO;
import com.mis.dto.LoginDTO;

@Repository
public class LoginDAOImpl implements LoginDAO{

	
	@Inject
	private SqlSession session;
	private static String namespace ="com.mis.mapper.loginMapper";
	
	@Override
	public MemberVO login(LoginDTO dto) throws Exception {
		return session.selectOne(namespace+".login", dto);
	}
	
	

}
