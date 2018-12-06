package br.com.ztec.model;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_cliente_pf database table.
 * 
 */
@Entity
@Table(name="tb_cliente_pf")
public class TbClientePf {


	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_cliente_pf_cadastramento", nullable=false)
	private Date tbClientePfCadastramento;

	@Column(name="tb_cliente_pf_cpf")
	private String tbClientePfCpf;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_cliente_pf_nascimento")
	private Date tbClientePfNascimento;

	@Column(name="tb_cliente_pf_nome", nullable=false)
	private String tbClientePfNome;

	@Column(name="tb_cliente_pf_sexo", nullable=false)
	private String tbClientePfSexo;

	@Column(name="tb_cliente_pf_status", nullable=false)
	private int tbClientePfStatus;

	//bi-directional many-to-one association to TbContato
	@OneToMany(mappedBy="tbClientePf")
	private List<TbContato> tbContatos;

	//bi-directional many-to-one association to TbEndereco
	@OneToMany(mappedBy="tbClientePf")
	private List<TbEndereco> tbEnderecos;

	public TbClientePf() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTbClientePfCadastramento() {
		return this.tbClientePfCadastramento;
	}

	public void setTbClientePfCadastramento(Date tbClientePfCadastramento) {
		this.tbClientePfCadastramento = tbClientePfCadastramento;
	}

	public String getTbClientePfCpf() {
		return this.tbClientePfCpf;
	}

	public void setTbClientePfCpf(String tbClientePfCpf) {
		this.tbClientePfCpf = tbClientePfCpf;
	}

	public Date getTbClientePfNascimento() {
		return this.tbClientePfNascimento;
	}

	public void setTbClientePfNascimento(Date tbClientePfNascimento) {
		this.tbClientePfNascimento = tbClientePfNascimento;
	}

	public String getTbClientePfNome() {
		return this.tbClientePfNome;
	}

	public void setTbClientePfNome(String tbClientePfNome) {
		this.tbClientePfNome = tbClientePfNome;
	}

	public String getTbClientePfSexo() {
		return this.tbClientePfSexo;
	}

	public void setTbClientePfSexo(String tbClientePfSexo) {
		this.tbClientePfSexo = tbClientePfSexo;
	}

	public int getTbClientePfStatus() {
		return this.tbClientePfStatus;
	}

	public void setTbClientePfStatus(int tbClientePfStatus) {
		this.tbClientePfStatus = tbClientePfStatus;
	}

	public List<TbContato> getTbContatos() {
		return this.tbContatos;
	}

	public void setTbContatos(List<TbContato> tbContatos) {
		this.tbContatos = tbContatos;
	}

	public TbContato addTbContato(TbContato tbContato) {
		getTbContatos().add(tbContato);
		tbContato.setTbClientePf(this);

		return tbContato;
	}

	public TbContato removeTbContato(TbContato tbContato) {
		getTbContatos().remove(tbContato);
		tbContato.setTbClientePf(null);

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
		tbEndereco.setTbClientePf(this);

		return tbEndereco;
	}

	public TbEndereco removeTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().remove(tbEndereco);
		tbEndereco.setTbClientePf(null);

		return tbEndereco;
	}

}