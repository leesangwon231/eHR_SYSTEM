package com.mis.dto;

public class LoginDTO {
	
	private int memNo;
	private String mempw;
	
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMempw() {
		return mempw;
	}
	public void setMempw(String mempw) {
		this.mempw = mempw;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [memNo=" + memNo + ", mempw=" + mempw + "]";
	}
	
	
	

}
