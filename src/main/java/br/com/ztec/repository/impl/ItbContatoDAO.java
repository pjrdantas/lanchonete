package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.TbContatoDTO;





public interface ItbContatoDAO {
	
    /**
     * INCLUIR CONTATO
     * @param tbContatoDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbContatoDTO(TbContatoDTO tbContatoDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CONTATO
     * @param tbContatoDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbContatoDTO(TbContatoDTO tbContatoDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CONTATOS
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbContatoDTO> getAllTbContatos()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CONTATO POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbContatoDTO getTbContatoById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CONTATO POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbContato(int id)  throws Exception, Throwable;
    
    
   
}
 