package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.JndetailVO;
import com.mis.domain.JnfileVO;
import com.mis.persistence.JndetailDAO;

@Service
public class JndetailServiceImpl implements JndetailService {

	@Inject
	private JndetailDAO dao;
	
	@Override
	public void register(JndetailVO vo) throws Exception {
		
		vo.setJndHistory(vo.getJndHistory().replace("\\r\\n", "<br>"));
		
		
		if (vo.getFiles() != null) {

					for (int i = 0; i < vo.getFiles().length; i++) {

						JnfileVO jnfileNo = new JnfileVO();
						jnfileNo.setJndNo(0); // 怨듭��궗�빆 �뀒�씠釉� PK (FK)
						jnfileNo.setJnfileName(vo.getFiles()[i]); // �뾽濡쒕뱶�맂 泥⑤��뙆�씪紐�

						dao.insertFile(jnfileNo);
					}
			}
		
	}	

	@Override
	public JndetailVO read(int jndNo) throws Exception {
		return dao.read(jndNo);
	}

	@Override
	public void modify(JndetailVO vo) throws Exception {
		
		vo.setJndHistory(vo.getJndHistory().replace("\\r\\n", "<br>"));
		
		dao.update(vo);
		
		dao.deleteFile(vo.getJndNo());
		
		if (vo.getFiles() != null) {

			for (int i = 0; i < vo.getFiles().length; i++) {

				JnfileVO jnfileNo = new JnfileVO();
				jnfileNo.setJndNo(vo.getJndNo()); 
				jnfileNo.setJnfileName(vo.getFiles()[i]); 
				
				dao.insertFile(jnfileNo);
			}
			
		}
	}	

	@Override
	public void remove(int jndNo) throws Exception {
		dao.deleteFile(jndNo);

		dao.delete(jndNo);
		
	}
	
	@Override
	public List<JnfileVO> fileList(int jndNo) throws Exception {
		return dao.fileList(jndNo);
	}
}
