package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.TbClientePfDTO;





public interface ItbClientePfDAO {
	
    /**
     * INCLUIR CLIENTE PESSOA FISICA
     * @param tbClientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbClientePfDTO(TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CLIENTE PESSOA FISICA
     * @param tbClientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbClientePfDTO(TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CLIENTES PESSOA FISICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbClientePfDTO> getAllTbClientePfs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CLIENTE PESSOA FISICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbClientePfDTO getTbClientePfById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CLIENTE PESSOA FISICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbClientePf(int id)  throws Exception, Throwable;
    
    
   
}
 