package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.ContatoDTO;





public interface IContatoRepository {
	
    /**
     * INCLUIR CONTATO
     * @param contatoDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbContatoDTO(ContatoDTO contatoDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR CONTATO
     * @param contatoDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbContatoDTO(ContatoDTO contatoDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS CONTATOS
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<ContatoDTO> getAllTbContatos()  throws Exception, Throwable;
    
    /**
     * PESQUISAR CONTATO POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    ContatoDTO getTbContatoById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR CONTATO POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbContato(int id)  throws Exception, Throwable;
    
    
   
}
 