package br.com.ztec.service.impl;

import java.util.List;

import br.com.ztec.model.dto.ClientePfDTO;




public interface IClientePfService {
	
	/**
	 * 
	 * @param clientePfDTO
	 * @throws Exception
	 * @throws Throwable
	 */
    void addClientePfDTO(ClientePfDTO clientePfDTO)   throws Exception, Throwable;
    
    /**
     * 
     * @param clientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateClientePfDTO(ClientePfDTO clientePfDTO)  throws Exception, Throwable;
    
    /**
     * 
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<ClientePfDTO> consultar()  throws Exception, Throwable;
    
    /**
     * 
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    ClientePfDTO getClientePfById(int id)  throws Exception, Throwable;
    
    /**
     * 
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteClientePf(int id)  throws Exception, Throwable;
}
