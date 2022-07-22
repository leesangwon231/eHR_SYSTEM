package com.mis.dto;

import java.util.Date;

public class JournalDTO {
	private int memNo;
	private String memName;
	private String memEmail;
	private String memZipcode;
	private String memAddr1;
	private String memAddr2;
	private Date memHiredate;
	private String memPosition;
	private String mem_Res;
	private int sNo;
	private int deptNo;
	private String sName;
	private int jgNo;
	private String jgName;
	private int lNo;
	private String lName;
	private int jobNo;
	private String jobName;
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
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemZipcode() {
		return memZipcode;
	}
	public void setMemZipcode(String memZipcode) {
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
	public String getMemPosition() {
		return memPosition;
	}
	public void setMemPosition(String memPosition) {
		this.memPosition = memPosition;
	}
	public String getMem_Res() {
		return mem_Res;
	}
	public void setMem_Res(String mem_Res) {
		this.mem_Res = mem_Res;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
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
	@Override
	public String toString() {
		return "JournalDTO [memNo=" + memNo + ", memName=" + memName + ", memEmail=" + memEmail + ", memZipcode="
				+ memZipcode + ", memAddr1=" + memAddr1 + ", memAddr2=" + memAddr2 + ", memHiredate=" + memHiredate
				+ ", memPosition=" + memPosition + ", mem_Res=" + mem_Res + ", sNo=" + sNo + ", deptNo=" + deptNo
				+ ", sName=" + sName + ", jgNo=" + jgNo + ", jgName=" + jgName + ", lNo=" + lNo + ", lName=" + lName
				+ ", jobNo=" + jobNo + ", jobName=" + jobName + "]";
	}
	
	
	
}
