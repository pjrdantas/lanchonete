package br.com.ztec.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_fornecedor_pf database table.
 * 
 */
@Entity
@Table(name="tb_fornecedor_pf")
public class TbFornecedorPf {


	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_fornecedor_pf_cadastramento", nullable=false)
	private Date tbFornecedorPfCadastramento;

	@Column(name="tb_fornecedor_pf_cpf", length=14)
	private String tbFornecedorPfCpf;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_fornecedor_pf_nascimento")
	private Date tbFornecedorPfNascimento;

	@Column(name="tb_fornecedor_pf_nome", nullable=false, length=45)
	private String tbFornecedorPfNome;

	@Column(name="tb_fornecedor_pf_sexo", length=10)
	private String tbFornecedorPfSexo;

	@Column(name="tb_fornecedor_pf_status", nullable=false)
	private int tbFornecedorPfStatus;

	//bi-directional many-to-one association to TbContato
	@OneToMany(mappedBy="tbFornecedorPf")
	private List<TbContato> tbContatos;

	//bi-directional many-to-one association to TbEndereco
	@OneToMany(mappedBy="tbFornecedorPf")
	private List<TbEndereco> tbEnderecos;

	public TbFornecedorPf() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTbFornecedorPfCadastramento() {
		return this.tbFornecedorPfCadastramento;
	}

	public void setTbFornecedorPfCadastramento(Date tbFornecedorPfCadastramento) {
		this.tbFornecedorPfCadastramento = tbFornecedorPfCadastramento;
	}

	public String getTbFornecedorPfCpf() {
		return this.tbFornecedorPfCpf;
	}

	public void setTbFornecedorPfCpf(String tbFornecedorPfCpf) {
		this.tbFornecedorPfCpf = tbFornecedorPfCpf;
	}

	public Date getTbFornecedorPfNascimento() {
		return this.tbFornecedorPfNascimento;
	}

	public void setTbFornecedorPfNascimento(Date tbFornecedorPfNascimento) {
		this.tbFornecedorPfNascimento = tbFornecedorPfNascimento;
	}

	public String getTbFornecedorPfNome() {
		return this.tbFornecedorPfNome;
	}

	public void setTbFornecedorPfNome(String tbFornecedorPfNome) {
		this.tbFornecedorPfNome = tbFornecedorPfNome;
	}

	public String getTbFornecedorPfSexo() {
		return this.tbFornecedorPfSexo;
	}

	public void setTbFornecedorPfSexo(String tbFornecedorPfSexo) {
		this.tbFornecedorPfSexo = tbFornecedorPfSexo;
	}

	public int getTbFornecedorPfStatus() {
		return this.tbFornecedorPfStatus;
	}

	public void setTbFornecedorPfStatus(int tbFornecedorPfStatus) {
		this.tbFornecedorPfStatus = tbFornecedorPfStatus;
	}

	public List<TbContato> getTbContatos() {
		return this.tbContatos;
	}

	public void setTbContatos(List<TbContato> tbContatos) {
		this.tbContatos = tbContatos;
	}

	public TbContato addTbContato(TbContato tbContato) {
		getTbContatos().add(tbContato);
		tbContato.setTbFornecedorPf(this);

		return tbContato;
	}

	public TbContato removeTbContato(TbContato tbContato) {
		getTbContatos().remove(tbContato);
		tbContato.setTbFornecedorPf(null);

		return tbContato;
	}

	public List<TbEndereco> getTbEnderecos() {
		return this.tbEnderecos;
	}

	public void setTbEnderecos(List<TbEndereco> tbEnderecos) {
		this.tbEnderecos = tbEnderecos;
	}

	public TbEndereco addTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().add(tbEndereco);
		tbEndereco.setTbFornecedorPf(this);

		return tbEndereco;
	}

	public TbEndereco removeTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().remove(tbEndereco);
		tbEndereco.setTbFornecedorPf(null);

		return tbEndereco;
	}

}