package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.domain.JournalVO;
import com.mis.domain.ScategoryVO;
import com.mis.dto.JournalDTO;
import com.mis.persistence.JournalDAO;

@Service
public class JournalServiceImpl implements JournalService {

	@Inject
	private JournalDAO dao;

	@Override
	public void jnRegister(JournalVO jvo) throws Exception {
		dao.jnCreate(jvo);
		
		int jnNo = dao.selectJnNo(jvo);
		//만약 i 의 files가 널이 아니라면 실행
		if (jvo.getFiles() != null) {  
			
			jvo.setJnNo(jnNo);
			//파일의 길이 만큼 반복실행
			for (int j = 0; j < jvo.getFiles().length; j++) {

				JnfileVO fVo = new JnfileVO();	
				
				fVo.setJnNo(jvo.getJnNo()); 
				
				fVo.setJnfileName(jvo.getFiles()[j]); 

				dao.insertFile(fVo);
					
			}

		}
	}

	@Override
	public void jndRegister(JndetailVO dvo, JournalVO jvo) throws Exception {
		
		//등록된 jnNo 받아오기
		int jnNo = dao.selectJnNo(jvo);
		
		//jnList의 사이즈 만큼 반복
		for (int i = 0; i < dvo.getJnLIst().size(); i++) {
			
			//jnList안에 i번째 VO에 jnNo 세팅
			dvo.getJnLIst().get(i).setJnNo(jnNo);
			
			//해당 i번째 vo로 jnd테이블 생성
			dao.jndCreate(dvo.getJnLIst().get(i));
			
		
		}
		
		
		

		


	}

	@Override
	public JournalVO readJournal(int jnNo) throws Exception {
		return dao.readJournal(jnNo);
	}

	@Override
	public List<JndetailVO> readJournalDetail(int jnNo) throws Exception {
		return dao.readJournalDetail(jnNo);
	}

	@Override
	public void modify(JndetailVO dvo, JournalVO jvo) throws Exception {
		
		//등록된 jnNo 받아오기
		int jnNo = dao.selectJnNo(jvo);
		//jnList의 사이즈 만큼 반복
		for (int i = 0; i < dvo.getJnLIst().size(); i++) {
			
			//jnList안에 i번째 VO에 jnNo 세팅
			dvo.getJnLIst().get(i).setJnNo(jnNo);
			
			//해당 i번째 vo로 jnd테이블 업데이트
			dao.jndUpdate(dvo.getJnLIst().get(i));
			
		}
		
		dao.deleteFile(jnNo);
		
		//만약 jvo의 files가 널이 아니라면 실행
		if (jvo.getFiles() != null) {  
			/*
			//JnNo 관련 파일 삭제
			dao.deleteFile(jnNo);*/
			
			//파일의 길이 만큼 반복실행
			for (int j = 0; j < jvo.getFiles().length; j++) {

				JnfileVO fVo = new JnfileVO();	
				
				fVo.setJnNo(jnNo); 
				
				fVo.setJnfileName(jvo.getFiles()[j]); 

				dao.insertFile(fVo);
				
				
			}
		}

	}

	@Override
	public void remove(Integer jnNo) throws Exception {
		dao.delete(jnNo);
	}

	@Override
	public List<JournalVO> listAll(int memNo) throws Exception {
		return dao.listAll(memNo);
	}

	@Override
	public List<ScategoryVO> selectSlist(int lNo) throws Exception {
		return dao.selectSlist(lNo);
	}

	@Override
	public JournalDTO selectAllListDTO(int memNo) throws Exception {
		return dao.selectAllListDTO(memNo);
	}

	@Override
	public int selectJnNo(JournalVO vo) throws Exception {
		return dao.selectJnNo(vo);
	}

	@Override
	public String selectSname(int sNo) throws Exception {
		return dao.selectSname(sNo);
	}

	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return dao.fileList(jndNo);
	}

	@Override
	public int checkDate(String jnWdate) throws Exception {
		return dao.checkDate(jnWdate);
	}

}
