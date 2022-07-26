package com.mis.domain;

public class JnfileVO {

	private int jnfileNo;
	private String jnfileName;
	private int jnNo;
	private String fileLocation;
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
	public int getJnNo() {
		return jnNo;
	}
	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	@Override
	public String toString() {
		return "JnfileVO [jnfileNo=" + jnfileNo + ", jnfileName=" + jnfileName + ", jnNo=" + jnNo + ", fileLocation="
				+ fileLocation + "]";
	}


}
