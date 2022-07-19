package com.mis.persistence;

import com.mis.domain.MemberVO;
import com.mis.dto.LoginDTO;

public interface LoginDAO {

	public MemberVO login(LoginDTO dto) throws Exception; 

}
