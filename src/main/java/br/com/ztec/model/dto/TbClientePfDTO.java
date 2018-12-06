package br.com.ztec.model.dto;

public class TbClientePfDTO {
	
	private int id;
	private String tbClientePfCadastramento;
	private String tbClientePfCpf;	
	private String tbClientePfNascimento;	
	private String tbClientePfNome;	
	private String tbClientePfSexo;	
	private int tbClientePfStatus;
	
	public  TbClientePfDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTbClientePfCadastramento() {
		return tbClientePfCadastramento;
	}

	public void setTbClientePfCadastramento(String tbClientePfCadastramento) {
		this.tbClientePfCadastramento = tbClientePfCadastramento;
	}

	public String getTbClientePfCpf() {
		return tbClientePfCpf;
	}

	public void setTbClientePfCpf(String tbClientePfCpf) {
		this.tbClientePfCpf = tbClientePfCpf;
	}

	public String getTbClientePfNascimento() {
		return tbClientePfNascimento;
	}

	public void setTbClientePfNascimento(String tbClientePfNascimento) {
		this.tbClientePfNascimento = tbClientePfNascimento;
	}

	public String getTbClientePfNome() {
		return tbClientePfNome;
	}

	public void setTbClientePfNome(String tbClientePfNome) {
		this.tbClientePfNome = tbClientePfNome;
	}

	public String getTbClientePfSexo() {
		return tbClientePfSexo;
	}

	public void setTbClientePfSexo(String tbClientePfSexo) {
		this.tbClientePfSexo = tbClientePfSexo;
	}

	public int getTbClientePfStatus() {
		return tbClientePfStatus;
	}

	public void setTbClientePfStatus(int tbClientePfStatus) {
		this.tbClientePfStatus = tbClientePfStatus;
	}


}
