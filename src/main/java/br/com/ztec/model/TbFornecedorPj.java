package br.com.ztec.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_fornecedor_pj database table.
 * 
 */
@Entity
@Table(name="tb_fornecedor_pj")
public class TbFornecedorPj {


	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_fornecedor_pj_cadastramento", nullable=false)
	private Date tbFornecedorPjCadastramento;

	@Column(name="tb_fornecedor_pj_cnpj", nullable=false, length=18)
	private String tbFornecedorPjCnpj;

	@Column(name="tb_fornecedor_pj_razao_social", nullable=false, length=45)
	private String tbFornecedorPjRazaoSocial;

	@Column(name="tb_fornecedor_pj_status", nullable=false)
	private int tbFornecedorPjStatus;

	//bi-directional many-to-one association to TbContato
	@OneToMany(mappedBy="tbFornecedorPj")
	private List<TbContato> tbContatos;

	//bi-directional many-to-one association to TbEndereco
	@OneToMany(mappedBy="tbFornecedorPj")
	private List<TbEndereco> tbEnderecos;

	public TbFornecedorPj() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTbFornecedorPjCadastramento() {
		return this.tbFornecedorPjCadastramento;
	}

	public void setTbFornecedorPjCadastramento(Date tbFornecedorPjCadastramento) {
		this.tbFornecedorPjCadastramento = tbFornecedorPjCadastramento;
	}

	public String getTbFornecedorPjCnpj() {
		return this.tbFornecedorPjCnpj;
	}

	public void setTbFornecedorPjCnpj(String tbFornecedorPjCnpj) {
		this.tbFornecedorPjCnpj = tbFornecedorPjCnpj;
	}

	public String getTbFornecedorPjRazaoSocial() {
		return this.tbFornecedorPjRazaoSocial;
	}

	public void setTbFornecedorPjRazaoSocial(String tbFornecedorPjRazaoSocial) {
		this.tbFornecedorPjRazaoSocial = tbFornecedorPjRazaoSocial;
	}

	public int getTbFornecedorPjStatus() {
		return this.tbFornecedorPjStatus;
	}

	public void setTbFornecedorPjStatus(int tbFornecedorPjStatus) {
		this.tbFornecedorPjStatus = tbFornecedorPjStatus;
	}

	public List<TbContato> getTbContatos() {
		return this.tbContatos;
	}

	public void setTbContatos(List<TbContato> tbContatos) {
		this.tbContatos = tbContatos;
	}

	public TbContato addTbContato(TbContato tbContato) {
		getTbContatos().add(tbContato);
		tbContato.setTbFornecedorPj(this);

		return tbContato;
	}

	public TbContato removeTbContato(TbContato tbContato) {
		getTbContatos().remove(tbContato);
		tbContato.setTbFornecedorPj(null);

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
		tbEndereco.setTbFornecedorPj(this);

		return tbEndereco;
	}

	public TbEndereco removeTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().remove(tbEndereco);
		tbEndereco.setTbFornecedorPj(null);

		return tbEndereco;
	}

}