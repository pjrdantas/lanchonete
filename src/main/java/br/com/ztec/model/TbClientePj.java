package br.com.ztec.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_cliente_pj database table.
 * 
 */
@Entity
@Table(name="tb_cliente_pj")
public class TbClientePj {

	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_cliente_pj_cadastramento", nullable=false)
	private Date tbClientePjCadastramento;

	@Column(name="tb_cliente_pj_cnpj", nullable=false, length=18)
	private String tbClientePjCnpj;

	@Column(name="tb_cliente_pj_razao_social", nullable=false, length=45)
	private String tbClientePjRazaoSocial;

	@Column(name="tb_cliente_pj_status", nullable=false)
	private int tbClientePjStatus;

	//bi-directional many-to-one association to TbContato
	@OneToMany(mappedBy="tbClientePj")
	private List<TbContato> tbContatos;

	//bi-directional many-to-one association to TbEndereco
	@OneToMany(mappedBy="tbClientePj")
	private List<TbEndereco> tbEnderecos;

	public TbClientePj() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTbClientePjCadastramento() {
		return this.tbClientePjCadastramento;
	}

	public void setTbClientePjCadastramento(Date tbClientePjCadastramento) {
		this.tbClientePjCadastramento = tbClientePjCadastramento;
	}

	public String getTbClientePjCnpj() {
		return this.tbClientePjCnpj;
	}

	public void setTbClientePjCnpj(String tbClientePjCnpj) {
		this.tbClientePjCnpj = tbClientePjCnpj;
	}

	public String getTbClientePjRazaoSocial() {
		return this.tbClientePjRazaoSocial;
	}

	public void setTbClientePjRazaoSocial(String tbClientePjRazaoSocial) {
		this.tbClientePjRazaoSocial = tbClientePjRazaoSocial;
	}

	public int getTbClientePjStatus() {
		return this.tbClientePjStatus;
	}

	public void setTbClientePjStatus(int tbClientePjStatus) {
		this.tbClientePjStatus = tbClientePjStatus;
	}

	public List<TbContato> getTbContatos() {
		return this.tbContatos;
	}

	public void setTbContatos(List<TbContato> tbContatos) {
		this.tbContatos = tbContatos;
	}

	public TbContato addTbContato(TbContato tbContato) {
		getTbContatos().add(tbContato);
		tbContato.setTbClientePj(this);

		return tbContato;
	}

	public TbContato removeTbContato(TbContato tbContato) {
		getTbContatos().remove(tbContato);
		tbContato.setTbClientePj(null);

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
		tbEndereco.setTbClientePj(this);

		return tbEndereco;
	}

	public TbEndereco removeTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().remove(tbEndereco);
		tbEndereco.setTbClientePj(null);

		return tbEndereco;
	}

}