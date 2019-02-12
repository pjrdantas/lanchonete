package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.ClientePfDTO;





public interface IclientePfRepository {
	
    /**
     * INCLUIR CLIENTE PESSOA FISICA
     * @param clientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void addClientePfDTO(ClientePfDTO clientePfDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CLIENTE PESSOA FISICA
     * @param clientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateClientePfDTO(ClientePfDTO clientePfDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CLIENTES PESSOA FISICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<ClientePfDTO> getAllClientePfs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CLIENTE PESSOA FISICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    ClientePfDTO getClientePfById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CLIENTE PESSOA FISICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteClientePf(int id)  throws Exception, Throwable;
    
    
   
}
 