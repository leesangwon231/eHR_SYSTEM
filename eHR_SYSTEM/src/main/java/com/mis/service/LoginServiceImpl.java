package com.mis.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.MemberVO;
import com.mis.dto.LoginDTO;
import com.mis.persistence.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Inject
	private LoginDAO dao;

	@Override
	public MemberVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
	
	
	
	
}
