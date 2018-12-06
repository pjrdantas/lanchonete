package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.TbClientePjDTO;







public interface ItbClientePjDAO {
	
    /**
     * INCLUIR CLIENTE PESSOA JURIDICA
     * @param tbClientePjDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbClientePjDTO(TbClientePjDTO tbClientePjDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CLIENTE PESSOA JURIDICA
     * @param tbClientePjDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbClientePjDTO(TbClientePjDTO tbClientePjDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CLIENTES PESSOA JURIDICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbClientePjDTO> getAllTbClientePjs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CLIENTE PESSOA JURIDICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbClientePjDTO getTbClientePjById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CLIENTE PESSOA JURIDICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbClientePj(int id)  throws Exception, Throwable;
    
    
   
}
 