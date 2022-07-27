package com.mis.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class JournalVO {

	private int jnNo;
	private String jnWdate;
	private int jnApno;
	private String jnSatisfaction;
	private String jnApproval;
	private int memNo;

	private String[] files;
	
	private ArrayList<JnfileVO> fileList;

	public int getJnNo() {
		return jnNo;
	}

	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}

	public String getJnWdate() {
		return jnWdate;
	}

	public void setJnWdate(String jnWdate) {
		this.jnWdate = jnWdate;
	}

	public int getJnApno() {
		return jnApno;
	}

	public void setJnApno(int jnApno) {
		this.jnApno = jnApno;
	}

	public String getJnSatisfaction() {
		return jnSatisfaction;
	}

	public void setJnSatisfaction(String jnSatisfaction) {
		this.jnSatisfaction = jnSatisfaction;
	}

	public String getJnApproval() {
		return jnApproval;
	}

	public void setJnApproval(String jnApproval) {
		this.jnApproval = jnApproval;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
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
		return "JournalVO [jnNo=" + jnNo + ", jnWdate=" + jnWdate + ", jnApno=" + jnApno + ", jnSatisfaction="
				+ jnSatisfaction + ", jnApproval=" + jnApproval + ", memNo=" + memNo + ", files="
				+ Arrays.toString(files) + ", fileList=" + fileList + "]";
	}


	
}
