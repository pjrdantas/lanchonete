package br.com.ztec.service.impl;

import java.util.List;

import br.com.ztec.model.dto.TbClientePfDTO;




public interface ITbClientePfService {
	
	/**
	 * 
	 * @param tbClientePfDTO
	 * @throws Exception
	 * @throws Throwable
	 */
    void addTbClientePfDTO(TbClientePfDTO tbClientePfDTO)   throws Exception, Throwable;
    
    /**
     * 
     * @param tbClientePfDTO
     * @throws Exception
     * @throws Throwable
     */
    void updateTbClientePfDTO(TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable;
    
    /**
     * 
     * @return
     * @throws Exception
     * @throws Throwable
     */
    List<TbClientePfDTO> consultar()  throws Exception, Throwable;
    
    /**
     * 
     * @param id
     * @return
     * @throws Exception
     * @throws Throwable
     */
    TbClientePfDTO getTbClientePfById(int id)  throws Exception, Throwable;
    
    /**
     * 
     * @param id
     * @throws Exception
     * @throws Throwable
     */
    void deleteTbClientePf(int id)  throws Exception, Throwable;
}
