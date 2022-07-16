package com.mis.persistence;

import java.util.List;

import com.mis.domain.JobVO;
import com.mis.domain.JobgroupVO;

public interface LcategoryDAO {

	public List<JobgroupVO> selectJobGroup() throws Exception;
	
	public List<JobVO> selectJob(int jgNo) throws Exception;
}
