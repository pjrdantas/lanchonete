package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.EnderecoDTO;





public interface IEnderecoRepository {
	
    /**
     * INCLUIR ENDERECO
     * @param enderecoDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbEnderecoDTO(EnderecoDTO enderecoDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR ENDERECO
     * @param enderecoDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbEnderecoDTO(EnderecoDTO enderecoDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS ENDERECOS
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<EnderecoDTO> getAllTbEnderecos()  throws Exception, Throwable;
    
    /**
     * PESQUISAR ENDERECO POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    EnderecoDTO getTbEnderecoById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR ENDERECO POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbEndereco(int id)  throws Exception, Throwable;
    
    
   
}
 