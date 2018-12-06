package br.com.ztec.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ztec.model.dto.TbClientePfDTO;
import br.com.ztec.repository.impl.ItbClientePfDAO;

@Transactional
@Repository
public class TbClientePfDAO implements ItbClientePfDAO {
	
	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

	
	/**
	 * INCLUI CLIENTE PESSOA FISICA 
	 */
	@Override
	public void addTbClientePfDTO(TbClientePfDTO tbClientePfDTO) throws Exception, Throwable {
		
		
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
		sql.append( "  values (:id, :tbClientePfCpf, :tbClientePfCadastramento, :tbClientePfNascimento, :tbClientePfNome, :tbClientePfSexo, :tbClientePfStatus)");

		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", tbClientePfDTO.getId())				
				.addValue("tbClientePfCpf", tbClientePfDTO.getTbClientePfCpf())
				.addValue("tbClientePfCadastramento", new Date())
				.addValue("tbClientePfNascimento", tbClientePfDTO.getTbClientePfNascimento())
				.addValue("tbClientePfNome", tbClientePfDTO.getTbClientePfNome())
				.addValue("tbClientePfSexo", tbClientePfDTO.getTbClientePfSexo())
				.addValue("tbClientePfStatus", 1);
		
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
	public void updateTbClientePfDTO(TbClientePfDTO tbClientePfDTO) throws Exception, Throwable {
		

		
		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_cliente_pf ");
		sql.append(" SET  ");
		sql.append(" tb_cliente_pf_cadastramento = :tbClientePfCadastramento, ");
		sql.append(" tb_cliente_pf_cpf = :tbClientePfCpf, ");
		sql.append(" tb_cliente_pf_nascimento = :tbClientePfNascimento, ");
		sql.append(" tb_cliente_pf_nome = :tbClientePfNome, ");
		sql.append(" tb_cliente_pf_sexo = :tbClientePfSexo, ");
		sql.append(" tb_cliente_pf_status = :tbClientePfStatus ");
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", tbClientePfDTO.getId())				
				.addValue("tbClientePfCpf", tbClientePfDTO.getTbClientePfCpf())
				.addValue("tbClientePfCadastramento", new Date())
				.addValue("tbClientePfNascimento", tbClientePfDTO.getTbClientePfNascimento())
				.addValue("tbClientePfNome", tbClientePfDTO.getTbClientePfNome())
				.addValue("tbClientePfSexo", tbClientePfDTO.getTbClientePfSexo())
				.addValue("tbClientePfStatus", tbClientePfDTO.getTbClientePfStatus());
		
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
	private List<TbClientePfDTO> devolveListaObjetos(StringBuilder sql, SqlParameterSource params)  throws Exception, Throwable  {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {
		
			TbClientePfDTO tbClientePfDTO = new TbClientePfDTO();

			tbClientePfDTO.setId(rs.getInt("id"));
			tbClientePfDTO.setTbClientePfCadastramento(rs.getString("tb_cliente_pf_cadastramento"));
			tbClientePfDTO.setTbClientePfCpf(rs.getString("tb_cliente_pf_cpf"));
			tbClientePfDTO.setTbClientePfNascimento(rs.getString("tb_cliente_pf_nascimento"));
			tbClientePfDTO.setTbClientePfNome(rs.getString("tb_cliente_pf_nome"));
			tbClientePfDTO.setTbClientePfSexo(rs.getString("tb_cliente_pf_sexo"));
			tbClientePfDTO.setTbClientePfStatus(rs.getInt("tb_cliente_pf_status"));
				
	return tbClientePfDTO;
	 
		});
	}
		
	
	/**
	 * LISTAR CLIENTES PESSOA FISICA
	 */
	@Override
	public List<TbClientePfDTO> getAllTbClientePfs() throws Exception, Throwable {
		
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
	private TbClientePfDTO devolveObjeto(StringBuilder sql, SqlParameterSource params)  throws Exception, Throwable  {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
			
			
			TbClientePfDTO tbClientePfDTO = new TbClientePfDTO();

			tbClientePfDTO.setId(rs.getInt("id"));
			tbClientePfDTO.setTbClientePfCadastramento(rs.getString("tb_cliente_pf_cadastramento"));
			tbClientePfDTO.setTbClientePfCpf(rs.getString("tb_cliente_pf_cpf"));
			tbClientePfDTO.setTbClientePfNascimento(rs.getString("tb_cliente_pf_nascimento"));
			tbClientePfDTO.setTbClientePfNome(rs.getString("tb_cliente_pf_nome"));
			tbClientePfDTO.setTbClientePfSexo(rs.getString("tb_cliente_pf_sexo"));
			tbClientePfDTO.setTbClientePfStatus(rs.getInt("tb_cliente_pf_status"));
						
			return tbClientePfDTO;

		});
	}
			
	/**
	 * CONSULTAR PESSOA FISICA POR ID
	 */
	@Override
	public TbClientePfDTO getTbClientePfById(int id) throws Exception, Throwable {
		
		StringBuilder sql = new StringBuilder(sqlSelectPrincipal);		
		sql.append(" WHERE id = :id ");
		SqlParameterSource params = new MapSqlParameterSource().addValue("id", id);
		
		return devolveObjeto(sql, params);
	}

	
	
	
	
	/**
	 * DELETA CLIENTE PESSOA FISICA POR ID
	 */
	@Override
	public void deleteTbClientePf(int id) throws Exception, Throwable {
		
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
