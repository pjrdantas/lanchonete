package br.com.ztec.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ztec.model.dto.TbClientePfDTO;
import br.com.ztec.response.ResponseModel;
import br.com.ztec.service.impl.ITbClientePfService;





@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class ClientePfController {
	
	
	
	@Autowired
	private ITbClientePfService clientePfService;


	/**
	 * 
	 * @param tbClientePfDTO
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/clientePf", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable {      

		try {			 
			this.clientePfService.addTbClientePfDTO(tbClientePfDTO); 
			return new ResponseModel(1,"Cliente PF salvo com sucesso!"); 
		}catch(Exception e) {
			return new ResponseModel(0,e.getMessage());			
		}
		
	}
 
	
	/**
	 * 
	 * @param tbClientePfDTO
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/clientePf", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody TbClientePfDTO tbClientePfDTO)  throws Exception, Throwable {


		
		try {			 
			this.clientePfService.updateTbClientePfDTO(tbClientePfDTO);		
			return new ResponseModel(1,"Cliente PF atualizado com sucesso!"); 
		}catch(Exception e) { 
			return new ResponseModel(0,e.getMessage());
		}
		
	}
	

	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/clientePf", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<TbClientePfDTO> consultar()  throws Exception, Throwable {
				
		return this.clientePfService.consultar();			
	}
	
	
	

	/**
	 * 
	 * @param idClientePf
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/clientePf/{idClientePf}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody TbClientePfDTO buscar(@PathVariable("idClientePf") String idClientePf)  throws Exception, Throwable {
		
		int id = Integer.parseInt(idClientePf);
		return this.clientePfService.getTbClientePfById(id);
		
	}
	
	 
	 
	/**
	 * 
	 * @param idClientePf
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/clientePf/{idClientePf}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("idClientePf") String idClientePf)  throws Exception, Throwable {
		
		int id = Integer.parseInt(idClientePf);
		 
		try { 
			clientePfService.deleteTbClientePf(id); 
			return new ResponseModel(1, "Cliente PF excluido com sucesso!"); 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}	
		 
} 
