package br.com.ztec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ztec.model.dto.ClientePfDTO;
import br.com.ztec.repository.impl.IclientePfRepository;
import br.com.ztec.service.impl.IClientePfService;




@Service
public class ClientePfService  implements IClientePfService {
	
	
	@Autowired
	private IclientePfRepository tbClientePfDAO;


	@Override
	public void addClientePfDTO(ClientePfDTO clientePfDTO)   throws Exception, Throwable {
		tbClientePfDAO.addClientePfDTO(clientePfDTO);
		
	}
	

	 
	@Override
	public void updateClientePfDTO(ClientePfDTO clientePfDTO)  throws Exception, Throwable {
		tbClientePfDAO.updateClientePfDTO(clientePfDTO);
	}
	

	@Override
	public List<ClientePfDTO> consultar()   throws Exception, Throwable {
		return tbClientePfDAO.getAllClientePfs();
	}

	
	
	@Override
	public ClientePfDTO getClientePfById(int id)  throws Exception, Throwable {
		ClientePfDTO obj = tbClientePfDAO.getClientePfById(id);
		return obj;
	}	
	
	 
	
	@Override
	public void deleteClientePf(int id)  throws Exception, Throwable {
		tbClientePfDAO.deleteClientePf(id);
	}

  

}
