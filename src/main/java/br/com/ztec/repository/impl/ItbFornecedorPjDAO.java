package br.com.ztec.repository.impl;


import java.util.List;

import br.com.ztec.model.dto.TbFornecedorPfDTO;





public interface ItbFornecedorPjDAO {
	
    /**
     * INCLUIR FORNECEDOR PESSOA FISICA
     * @param tbFornecedorPfDTO
     * @throws Exception
     * @throws Throwable
     */
    void addTbFornecedorPfDTO(TbFornecedorPfDTO tbFornecedorPfDTO)  throws Exception, Throwable;
    
    /**
     * EDITAR FORNECEDOR PESSOA FISICA
     * @param tbFornecedorPfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbFornecedorPfDTO(TbFornecedorPfDTO tbFornecedorPfDTO)  throws Exception, Throwable;
    
    /**
     * LISTAR TODOS FORNECEDORS PESSOA FISICA
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbFornecedorPfDTO> getAllTbFornecedorPfs()  throws Exception, Throwable;
    
    /**
     * PESQUISAR FORNECEDOR PESSOA FISICA POR ID
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbFornecedorPfDTO getTbFornecedorPfById(int id)  throws Exception, Throwable;
    
    /**
     * DELETAR FORNECEDOR PESSOA FISICA POR ID
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbFornecedorPf(int id)  throws Exception, Throwable;
    
    
   
}
 