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
	private int memPos;
	private int memRes;
	private int jgNo;
	private String jgName;
	private int deptNo;
	private String deptName;
	private int jobNo;
	private String jobName;
	private int lNo;
	private String lName;
	private int sNo;
	private String sName;

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

	public int getMemPos() {
		return memPos;
	}

	public void setMemPos(int memPos) {
		this.memPos = memPos;
	}

	public int getMemRes() {
		return memRes;
	}

	public void setMemRes(int memRes) {
		this.memRes = memRes;
	}

	public int getJgNo() {
		return jgNo;
	}

	public void setJgNo(int jgNo) {
		this.jgNo = jgNo;
	}

	public String getJgName() {
		return jgName;
	}

	public void setJgName(String jgName) {
		this.jgName = jgName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getlNo() {
		return lNo;
	}

	public void setlNo(int lNo) {
		this.lNo = lNo;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "MemberVO [memNo=" + memNo + ", memName=" + memName + ", memPw=" + memPw + ", memEmail=" + memEmail
				+ ", memZipcode=" + memZipcode + ", memAddr1=" + memAddr1 + ", memAddr2=" + memAddr2 + ", memHiredate="
				+ memHiredate + ", memPos=" + memPos + ", memRes=" + memRes + ", jgNo=" + jgNo + ", jgName=" + jgName
				+ ", deptNo=" + deptNo + ", deptName=" + deptName + ", jobNo=" + jobNo + ", jobName=" + jobName
				+ ", lNo=" + lNo + ", lName=" + lName + ", sNo=" + sNo + ", sName=" + sName + "]";
	}

}
