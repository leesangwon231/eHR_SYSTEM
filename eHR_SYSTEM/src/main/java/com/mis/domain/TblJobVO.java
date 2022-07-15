package com.mis.domain;

public class TblJobVO {

	private int jobNo;
	private String jobName;
	private int jgNo;
	
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
	public int getJgNo() {
		return jgNo;
	}
	public void setJgNo(int jgNo) {
		this.jgNo = jgNo;
	}
	
	@Override
	public String toString() {
		return "TblJobVO [jobNo=" + jobNo + ", jobName=" + jobName + ", jgNo=" + jgNo + "]";
	}
	
}
