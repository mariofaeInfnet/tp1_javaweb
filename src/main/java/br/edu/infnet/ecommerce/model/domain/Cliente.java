package br.edu.infnet.ecommerce.model.domain;

public class  Cliente {
	
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	
	public Cliente() {
		// para satisfazer uma condição do Spring
	}
	
	public Cliente(String nome, String telefone, String email) {
		this.nome = nome;
		this.senha = telefone;
		this.email = email;
	}
	
	public Cliente(Integer id, String nome, String telefone, String email) {
		this(nome, telefone, email);
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");		
		sb.append(senha);		
		sb.append(";");		
		sb.append(email);	
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return senha;
	}
	public void setTelefone(String telefone) {
		this.senha = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
