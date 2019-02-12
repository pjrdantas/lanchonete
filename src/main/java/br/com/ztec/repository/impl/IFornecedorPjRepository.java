package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.FornecedorPfDTO;





public interface IFornecedorPjRepository {
	
    /**
     * INCLUIR FORNECEDOR PESSOA FISICA
     * @param fornecedorPfDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbFornecedorPfDTO(FornecedorPfDTO fornecedorPfDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR FORNECEDOR PESSOA FISICA
     * @param fornecedorPfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbFornecedorPfDTO(FornecedorPfDTO fornecedorPfDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS FORNECEDORS PESSOA FISICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<FornecedorPfDTO> getAllTbFornecedorPfs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR FORNECEDOR PESSOA FISICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    FornecedorPfDTO getTbFornecedorPfById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR FORNECEDOR PESSOA FISICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbFornecedorPf(int id)  throws Exception, Throwable;
    
    
   
}
 