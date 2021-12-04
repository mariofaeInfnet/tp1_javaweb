package br.edu.infnet.ecommerce.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tCliente") //utiliza-se caso queira usar uma tabela com um nome diferente da classe, por padrao sao iguais.
public class  Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	public Cliente() {
		// exigido pelo Spring
	}
	public Cliente(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public Cliente(Integer id, String nome, String email, String senha) {
		this(nome, email, senha);
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");	
		sb.append(email);	
		sb.append(";");	
		sb.append(senha);		
		return sb.toString();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
