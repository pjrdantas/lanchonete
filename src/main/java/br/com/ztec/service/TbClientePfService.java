package br.com.ztec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ztec.model.dto.TbClientePfDTO;
import br.com.ztec.repository.impl.ItbClientePfDAO;
import br.com.ztec.service.impl.ITbClientePfService;



@Service
public class TbClientePfService  implements ITbClientePfService {
	
	
	@Autowired
	private ItbClientePfDAO tbClientePfDAO;


	@Override
	public void addTbClientePfDTO(TbClientePfDTO tbClientePfDTO)   throws Exception, Throwable {
		tbClientePfDAO.addTbClientePfDTO(tbClientePfDTO);
		
	}
	

	 
	@Override
	public void updateTbClientePfDTO(TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable {
		tbClientePfDAO.updateTbClientePfDTO(tbClientePfDTO);
	}
	

	@Override
	public List<TbClientePfDTO> consultar()   throws Exception, Throwable {
		return tbClientePfDAO.getAllTbClientePfs();
	}

	
	
	@Override
	public TbClientePfDTO getTbClientePfById(int id)  throws Exception, Throwable {
		TbClientePfDTO obj = tbClientePfDAO.getTbClientePfById(id);
		return obj;
	}	
	
	 
	
	@Override
	public void deleteTbClientePf(int id)  throws Exception, Throwable {
		tbClientePfDAO.deleteTbClientePf(id);
	}

  

}
