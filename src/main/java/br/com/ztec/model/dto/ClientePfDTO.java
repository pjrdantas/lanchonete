package br.com.ztec.model.dto;

public class ClientePfDTO {
	
	private int id;		
	private String clientePfNome;	
	private String clientePfNascimento;	
	private String clientePfCpf;
	private String clientePfSexo;	
	private String clientePfCadastramento;
	private int clientePfStatus;
	
	public  ClientePfDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientePfNome() {
		return clientePfNome;
	}

	public void setClientePfNome(String clientePfNome) {
		this.clientePfNome = clientePfNome;
	}

	public String getClientePfNascimento() {
		return clientePfNascimento;
	}

	public void setClientePfNascimento(String clientePfNascimento) {
		this.clientePfNascimento = clientePfNascimento;
	}

	public String getClientePfCpf() {
		return clientePfCpf;
	}

	public void setClientePfCpf(String clientePfCpf) {
		this.clientePfCpf = clientePfCpf;
	}

	public String getClientePfSexo() {
		return clientePfSexo;
	}

	public void setClientePfSexo(String clientePfSexo) {
		this.clientePfSexo = clientePfSexo;
	}

	public String getClientePfCadastramento() {
		return clientePfCadastramento;
	}

	public void setClientePfCadastramento(String clientePfCadastramento) {
		this.clientePfCadastramento = clientePfCadastramento;
	}

	public int getClientePfStatus() {
		return clientePfStatus;
	}

	public void setClientePfStatus(int clientePfStatus) {
		this.clientePfStatus = clientePfStatus;
	}

	

}
