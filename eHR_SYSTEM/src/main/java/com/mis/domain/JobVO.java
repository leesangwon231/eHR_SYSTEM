package com.mis.domain;

public class JobVO {

	private int jobNo;
	private String jobName;
	private int jgNo;
	private String jgName;

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

	public String getJgName() {
		return jgName;
	}

	public void setJgName(String jgName) {
		this.jgName = jgName;
	}

	@Override
	public String toString() {
		return "JobVO [jobNo=" + jobNo + ", jobName=" + jobName + ", jgNo=" + jgNo + ", jgName=" + jgName + "]";
	}

}
