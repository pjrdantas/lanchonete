package br.com.ztec.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ztec.model.dto.ClientePfDTO;
import br.com.ztec.repository.impl.IclientePfRepository;

@Transactional
@Repository
public class ClientePfRepository implements IclientePfRepository {
	
	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

	
	/**
	 * INCLUI CLIENTE PESSOA FISICA 
	 */
	@Override
	public void addClientePfDTO(ClientePfDTO clientePfDTO) throws Exception, Throwable {
		
		
		StringBuilder sql = new StringBuilder();
		
		sql.append(	"  INSERT INTO ");
		sql.append( "  tb_cliente_pf (");
		sql.append( "  id, ");		
		sql.append( "  tb_cliente_pf_cpf, ");
		sql.append( "  tb_cliente_pf_cadastramento, ");
		sql.append( "  tb_cliente_pf_nascimento, ");
		sql.append( "  tb_cliente_pf_nome, ");
		sql.append( "  tb_cliente_pf_sexo, ");
		sql.append( "  tb_cliente_pf_status) ");
		sql.append( "  values (:id, :clientePfCpf, :clientePfCadastramento, :clientePfNascimento, :clientePfNome, :clientePfSexo, :clientePfStatus)");

		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", clientePfDTO.getId())				
				.addValue("clientePfCpf", clientePfDTO.getClientePfCpf())
				.addValue("clientePfCadastramento", new Date())
				.addValue("clientePfNascimento", clientePfDTO.getClientePfNascimento())
				.addValue("clientePfNome", clientePfDTO.getClientePfNome())
				.addValue("clientePfSexo", clientePfDTO.getClientePfSexo())
				.addValue("clientePfStatus", 1);
		
		try{
	    	 jdbcTemplate.update(sql.toString(), params);	         
	     }catch (Exception e){
	    	
	    	 System.out.println("----------------- ERRO NO INSERT DO CLIENTE PESSOA FISICA -------------------------------" + e.toString());
	        
	     }
	}

	
	/**
	 * UPDATE DO CLIENTE PESSOA FISICA
	 */
	@Override
	public void updateClientePfDTO(ClientePfDTO clientePfDTO) throws Exception, Throwable {
		

		
		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_cliente_pf ");
		sql.append(" SET  ");
		sql.append(" tb_cliente_pf_cadastramento = :clientePfCadastramento, ");
		sql.append(" tb_cliente_pf_cpf = :clientePfCpf, ");
		sql.append(" tb_cliente_pf_nascimento = :clientePfNascimento, ");
		sql.append(" tb_cliente_pf_nome = :clientePfNome, ");
		sql.append(" tb_cliente_pf_sexo = :clientePfSexo, ");
		sql.append(" tb_cliente_pf_status = :clientePfStatus ");
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", clientePfDTO.getId())				
				.addValue("clientePfCpf", clientePfDTO.getClientePfCpf())
				.addValue("clientePfCadastramento", new Date())
				.addValue("clientePfNascimento", clientePfDTO.getClientePfNascimento())
				.addValue("clientePfNome", clientePfDTO.getClientePfNome())
				.addValue("clientePfSexo", clientePfDTO.getClientePfSexo())
				.addValue("clientePfStatus", clientePfDTO.getClientePfStatus());
		
		try{
	    	 jdbcTemplate.update(sql.toString(), params);
	         
	     }catch (Exception e){
	    	 System.out.println("----------------- ERRO NO UPDATE DO CLIENTE PESSOA FISICA -------------------------------" + e.toString());
	        
	     }	
	}

	
	/**
	 *  PREPARANDO REGISTRO DO CLIENTE PESSOA FISICA
	 */
	final static StringBuilder sqlSelectPrincipal = new StringBuilder().append(
			"  SELECT ")
			.append("  id")
			.append("  ,tb_cliente_pf_cadastramento")
			.append("  ,tb_cliente_pf_cpf")
			.append("  ,tb_cliente_pf_nascimento")
			.append("  ,tb_cliente_pf_nome")
			.append("  ,tb_cliente_pf_sexo")
			.append("  ,tb_cliente_pf_status")
			.append("  FROM tb_cliente_pf ");
	
	
	
	
	/**
	 * LISTAR CLIENTE PESSOA FISICA
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private List<ClientePfDTO> devolveListaObjetos(StringBuilder sql, SqlParameterSource params)  throws Exception, Throwable  {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {
		
			ClientePfDTO clientePfDTO = new ClientePfDTO();

			clientePfDTO.setId(rs.getInt("id"));
			clientePfDTO.setClientePfCadastramento(rs.getString("tb_cliente_pf_cadastramento"));
			clientePfDTO.setClientePfCpf(rs.getString("tb_cliente_pf_cpf"));
			clientePfDTO.setClientePfNascimento(rs.getString("tb_cliente_pf_nascimento"));
			clientePfDTO.setClientePfNome(rs.getString("tb_cliente_pf_nome"));
			clientePfDTO.setClientePfSexo(rs.getString("tb_cliente_pf_sexo"));
			clientePfDTO.setClientePfStatus(rs.getInt("tb_cliente_pf_status"));
				
	return clientePfDTO;
	 
		});
	}
		
	
	/**
	 * LISTAR CLIENTES PESSOA FISICA
	 */
	@Override
	public List<ClientePfDTO> getAllClientePfs() throws Exception, Throwable {
		
		StringBuilder sql = new StringBuilder(sqlSelectPrincipal)		
		.append(" order by tb_cliente_pf_nome ");
		
		return devolveListaObjetos(sql, null);
	}
	
	
	
	
	
	
	
	/**
	 * CONSULTA POR ID CLIENTE PESSOA FISICA
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private ClientePfDTO devolveObjeto(StringBuilder sql, SqlParameterSource params)  throws Exception, Throwable  {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
			
			
			ClientePfDTO clientePfDTO = new ClientePfDTO();

			clientePfDTO.setId(rs.getInt("id"));
			clientePfDTO.setClientePfCadastramento(rs.getString("tb_cliente_pf_cadastramento"));
			clientePfDTO.setClientePfCpf(rs.getString("tb_cliente_pf_cpf"));
			clientePfDTO.setClientePfNascimento(rs.getString("tb_cliente_pf_nascimento"));
			clientePfDTO.setClientePfNome(rs.getString("tb_cliente_pf_nome"));
			clientePfDTO.setClientePfSexo(rs.getString("tb_cliente_pf_sexo"));
			clientePfDTO.setClientePfStatus(rs.getInt("tb_cliente_pf_status"));
						
			return clientePfDTO;

		});
	}
			
	/**
	 * CONSULTAR PESSOA FISICA POR ID
	 */
	@Override
	public ClientePfDTO getClientePfById(int id) throws Exception, Throwable {
		
		StringBuilder sql = new StringBuilder(sqlSelectPrincipal);		
		sql.append(" WHERE id = :id ");
		SqlParameterSource params = new MapSqlParameterSource().addValue("id", id);
		
		return devolveObjeto(sql, params);
	}

	
	
	
	
	/**
	 * DELETA CLIENTE PESSOA FISICA POR ID
	 */
	@Override
	public void deleteClientePf(int id) throws Exception, Throwable {
		
		StringBuilder sql = new StringBuilder();
		
		sql.append(" DELETE FROM ");
	    sql.append(" tb_cliente_pf "); 
	    sql.append(" WHERE id = :id");	        

	     SqlParameterSource params = new MapSqlParameterSource().addValue("id", id);

			try{
		    	 jdbcTemplate.update(sql.toString(), params);		         
		     }catch (Exception e){
		    	 System.out.println("----------------- ERRO NO DELETE DO CLIENTE PESSOA FISICA -------------------------------" + e.toString());
		        
		     }
		
	}
	
	

}
