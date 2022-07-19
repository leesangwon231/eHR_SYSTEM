package com.mis.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class JndetailVO {
	private int jndNo;
	private int jndProgress;
	private String jndNote;
	private String jndHistory;
	private int jnNo;
	private int sNo;
	private String[] files;
	private ArrayList<JnfileVO> fileList;
	
	public int getJndNo() {
		return jndNo;
	}
	public void setJndNo(int jndNo) {
		this.jndNo = jndNo;
	}
	public int getJndProgress() {
		return jndProgress;
	}
	public void setJndProgress(int jndProgress) {
		this.jndProgress = jndProgress;
	}
	public String getJndNote() {
		return jndNote;
	}
	public void setJndNote(String jndNote) {
		this.jndNote = jndNote;
	}
	public String getJndHistory() {
		return jndHistory;
	}
	public void setJndHistory(String jndHistory) {
		this.jndHistory = jndHistory;
	}
	public int getJnNo() {
		return jnNo;
	}
	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String[] getFiles() {
		return files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}
	public ArrayList<JnfileVO> getFileList() {
		return fileList;
	}
	public void setFileList(ArrayList<JnfileVO> fileList) {
		this.fileList = fileList;
	}
	@Override
	public String toString() {
		return "JndetailVO [jndNo=" + jndNo + ", jndProgress=" + jndProgress + ", jndNote=" + jndNote + ", jndHistory="
				+ jndHistory + ", jnNo=" + jnNo + ", sNo=" + sNo + ", files=" + Arrays.toString(files) + ", fileList="
				+ fileList + "]";
	}
}
