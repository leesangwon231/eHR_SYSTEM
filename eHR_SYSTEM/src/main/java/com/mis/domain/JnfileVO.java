package com.mis.domain;

public class JnfileVO {

	private int jnfileNo;
	private String jnfileName;
	private String jnfileLoc;
	private int jndNo;
	
	public int getJnfileNo() {
		return jnfileNo;
	}
	public void setJnfileNo(int jnfileNo) {
		this.jnfileNo = jnfileNo;
	}
	public String getJnfileName() {
		return jnfileName;
	}
	public void setJnfileName(String jnfileName) {
		this.jnfileName = jnfileName;
	}
	public String getJnfileLoc() {
		return jnfileLoc;
	}
	public void setJnfileLoc(String jnfileLoc) {
		this.jnfileLoc = jnfileLoc;
	}
	public int getJndNo() {
		return jndNo;
	}
	public void setJndNo(int jndNo) {
		this.jndNo = jndNo;
	}
	
	@Override
	public String toString() {
		return "TblJnfileVO [jnfileNo=" + jnfileNo + ", jnfileName=" + jnfileName + ", jnfileLoc=" + jnfileLoc
				+ ", jndNo=" + jndNo + "]";
	}
	
	
}
