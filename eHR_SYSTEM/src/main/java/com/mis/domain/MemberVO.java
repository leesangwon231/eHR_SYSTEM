package com.mis.domain;

import java.util.Date;

public class MemberVO {
	
	private int memNo;
	private String memName;
	private String memPw;
	private String memEmail;
	private int memZipcode;
	private String memAddr1;
	private String memAddr2;
	private Date memHiredate;
	private String memRes;
	private int jgNo;
	private int deptNo;
	
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public int getMemZipcode() {
		return memZipcode;
	}
	public void setMemZipcode(int memZipcode) {
		this.memZipcode = memZipcode;
	}
	public String getMemAddr1() {
		return memAddr1;
	}
	public void setMemAddr1(String memAddr1) {
		this.memAddr1 = memAddr1;
	}
	public String getMemAddr2() {
		return memAddr2;
	}
	public void setMemAddr2(String memAddr2) {
		this.memAddr2 = memAddr2;
	}
	public Date getMemHiredate() {
		return memHiredate;
	}
	public void setMemHiredate(Date memHiredate) {
		this.memHiredate = memHiredate;
	}
	public String getMemRes() {
		return memRes;
	}
	public void setMemRes(String memRes) {
		this.memRes = memRes;
	}
	public int getJgNo() {
		return jgNo;
	}
	public void setJgNo(int jgNo) {
		this.jgNo = jgNo;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "TblMemberVO [memNo=" + memNo + ", memName=" + memName + ", memPw=" + memPw + ", memEmail=" + memEmail
				+ ", memZipcode=" + memZipcode + ", memAddr1=" + memAddr1 + ", memAddr2=" + memAddr2 + ", memHiredate="
				+ memHiredate + ", memRes=" + memRes + ", jgNo=" + jgNo + ", deptNo=" + deptNo + "]";
	}
	


}
