package com.mis.service;

import com.mis.domain.MemberVO;
import com.mis.dto.LoginDTO;

public interface LoginService {

	
	public MemberVO login(LoginDTO dto) throws Exception; 

}
