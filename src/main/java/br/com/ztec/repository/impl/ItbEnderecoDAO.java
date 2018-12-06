package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.TbEnderecoDTO;





public interface ItbEnderecoDAO {
	
    /**
     * INCLUIR ENDERECO
     * @param tbEnderecoDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbEnderecoDTO(TbEnderecoDTO tbEnderecoDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR ENDERECO
     * @param tbEnderecoDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbEnderecoDTO(TbEnderecoDTO tbEnderecoDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS ENDERECOS
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbEnderecoDTO> getAllTbEnderecos()  throws Exception, Throwable;
    
    /**
     * PESQUISAR ENDERECO POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbEnderecoDTO getTbEnderecoById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR ENDERECO POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbEndereco(int id)  throws Exception, Throwable;
    
    
   
}
 