package br.com.ztec.model;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_endereco database table.
 * 
 */
@Entity
@Table(name="tb_endereco")
public class TbEndereco {


	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Column(name="tb_endereco_bairro", length=45)
	private String tbEnderecoBairro;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_endereco_cadastramento", nullable=false)
	private Date tbEnderecoCadastramento;

	@Column(name="tb_endereco_cep", nullable=false, length=45)
	private String tbEnderecoCep;

	@Column(name="tb_endereco_complemento", length=45)
	private String tbEnderecoComplemento;

	@Column(name="tb_endereco_logradouro", length=45)
	private String tbEnderecoLogradouro;

	@Column(name="tb_endereco_numero")
	private int tbEnderecoNumero;

	@Column(name="tb_endereco_status", nullable=false)
	private int tbEnderecoStatus;

	@Column(name="tb_endereco_tipo", nullable=false, length=45)
	private String tbEnderecoTipo;

	//bi-directional many-to-one association to TbClientePf
	@ManyToOne
	@JoinColumn(name="tb_cliente_pf_id", nullable=false)
	private TbClientePf tbClientePf;

	//bi-directional many-to-one association to TbClientePj
	@ManyToOne
	@JoinColumn(name="tb_cliente_pj_id", nullable=false)
	private TbClientePj tbClientePj;

	//bi-directional many-to-one association to TbFornecedorPf
	@ManyToOne
	@JoinColumn(name="tb_fornecedor_pf_id", nullable=false)
	private TbFornecedorPf tbFornecedorPf;

	//bi-directional many-to-one association to TbFornecedorPj
	@ManyToOne
	@JoinColumn(name="tb_fornecedor_pj_id", nullable=false)
	private TbFornecedorPj tbFornecedorPj;

	public TbEndereco() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTbEnderecoBairro() {
		return this.tbEnderecoBairro;
	}

	public void setTbEnderecoBairro(String tbEnderecoBairro) {
		this.tbEnderecoBairro = tbEnderecoBairro;
	}

	public Date getTbEnderecoCadastramento() {
		return this.tbEnderecoCadastramento;
	}

	public void setTbEnderecoCadastramento(Date tbEnderecoCadastramento) {
		this.tbEnderecoCadastramento = tbEnderecoCadastramento;
	}

	public String getTbEnderecoCep() {
		return this.tbEnderecoCep;
	}

	public void setTbEnderecoCep(String tbEnderecoCep) {
		this.tbEnderecoCep = tbEnderecoCep;
	}

	public String getTbEnderecoComplemento() {
		return this.tbEnderecoComplemento;
	}

	public void setTbEnderecoComplemento(String tbEnderecoComplemento) {
		this.tbEnderecoComplemento = tbEnderecoComplemento;
	}

	public String getTbEnderecoLogradouro() {
		return this.tbEnderecoLogradouro;
	}

	public void setTbEnderecoLogradouro(String tbEnderecoLogradouro) {
		this.tbEnderecoLogradouro = tbEnderecoLogradouro;
	}

	public int getTbEnderecoNumero() {
		return this.tbEnderecoNumero;
	}

	public void setTbEnderecoNumero(int tbEnderecoNumero) {
		this.tbEnderecoNumero = tbEnderecoNumero;
	}

	public int getTbEnderecoStatus() {
		return this.tbEnderecoStatus;
	}

	public void setTbEnderecoStatus(int tbEnderecoStatus) {
		this.tbEnderecoStatus = tbEnderecoStatus;
	}

	public String getTbEnderecoTipo() {
		return this.tbEnderecoTipo;
	}

	public void setTbEnderecoTipo(String tbEnderecoTipo) {
		this.tbEnderecoTipo = tbEnderecoTipo;
	}

	public TbClientePf getTbClientePf() {
		return this.tbClientePf;
	}

	public void setTbClientePf(TbClientePf tbClientePf) {
		this.tbClientePf = tbClientePf;
	}

	public TbClientePj getTbClientePj() {
		return this.tbClientePj;
	}

	public void setTbClientePj(TbClientePj tbClientePj) {
		this.tbClientePj = tbClientePj;
	}

	public TbFornecedorPf getTbFornecedorPf() {
		return this.tbFornecedorPf;
	}

	public void setTbFornecedorPf(TbFornecedorPf tbFornecedorPf) {
		this.tbFornecedorPf = tbFornecedorPf;
	}

	public TbFornecedorPj getTbFornecedorPj() {
		return this.tbFornecedorPj;
	}

	public void setTbFornecedorPj(TbFornecedorPj tbFornecedorPj) {
		this.tbFornecedorPj = tbFornecedorPj;
	}

}