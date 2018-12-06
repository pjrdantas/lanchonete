package br.com.ztec.model;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_contato database table.
 * 
 */
@Entity
@Table(name="tb_contato")
public class TbContato {


	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_contato_cadastramento", nullable=false)
	private Date tbContatoCadastramento;

	@Column(name="tb_contato_email", length=45)
	private String tbContatoEmail;

	@Column(name="tb_contato_skype", length=45)
	private String tbContatoSkype;

	@Column(name="tb_contato_telefone_ddd", length=4)
	private String tbContatoTelefoneDdd;

	@Column(name="tb_contato_telefone_nome", length=45)
	private String tbContatoTelefoneNome;

	@Column(name="tb_contato_telefone_numero", length=10)
	private String tbContatoTelefoneNumero;

	@Column(name="tb_contato_telefone_tipo", length=45)
	private String tbContatoTelefoneTipo;

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

	public TbContato() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTbContatoCadastramento() {
		return this.tbContatoCadastramento;
	}

	public void setTbContatoCadastramento(Date tbContatoCadastramento) {
		this.tbContatoCadastramento = tbContatoCadastramento;
	}

	public String getTbContatoEmail() {
		return this.tbContatoEmail;
	}

	public void setTbContatoEmail(String tbContatoEmail) {
		this.tbContatoEmail = tbContatoEmail;
	}

	public String getTbContatoSkype() {
		return this.tbContatoSkype;
	}

	public void setTbContatoSkype(String tbContatoSkype) {
		this.tbContatoSkype = tbContatoSkype;
	}

	public String getTbContatoTelefoneDdd() {
		return this.tbContatoTelefoneDdd;
	}

	public void setTbContatoTelefoneDdd(String tbContatoTelefoneDdd) {
		this.tbContatoTelefoneDdd = tbContatoTelefoneDdd;
	}

	public String getTbContatoTelefoneNome() {
		return this.tbContatoTelefoneNome;
	}

	public void setTbContatoTelefoneNome(String tbContatoTelefoneNome) {
		this.tbContatoTelefoneNome = tbContatoTelefoneNome;
	}

	public String getTbContatoTelefoneNumero() {
		return this.tbContatoTelefoneNumero;
	}

	public void setTbContatoTelefoneNumero(String tbContatoTelefoneNumero) {
		this.tbContatoTelefoneNumero = tbContatoTelefoneNumero;
	}

	public String getTbContatoTelefoneTipo() {
		return this.tbContatoTelefoneTipo;
	}

	public void setTbContatoTelefoneTipo(String tbContatoTelefoneTipo) {
		this.tbContatoTelefoneTipo = tbContatoTelefoneTipo;
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