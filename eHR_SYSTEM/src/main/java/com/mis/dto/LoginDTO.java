package com.mis.dto;

public class LoginDTO {
	
	private int memNo;
	private String memPw;
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	@Override
	public String toString() {
		return "LoginDTO [memNo=" + memNo + ", memPw=" + memPw + "]";
	}
	
}
