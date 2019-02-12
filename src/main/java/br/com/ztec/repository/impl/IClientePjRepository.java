package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.ClientePjDTO;







public interface IClientePjRepository {
	
    /**
     * INCLUIR CLIENTE PESSOA JURIDICA
     * @param clientePjDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbClientePjDTO(ClientePjDTO clientePjDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CLIENTE PESSOA JURIDICA
     * @param clientePjDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbClientePjDTO(ClientePjDTO clientePjDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CLIENTES PESSOA JURIDICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<ClientePjDTO> getAllTbClientePjs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CLIENTE PESSOA JURIDICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    ClientePjDTO getTbClientePjById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CLIENTE PESSOA JURIDICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbClientePj(int id)  throws Exception, Throwable;
    
    
   
}
 