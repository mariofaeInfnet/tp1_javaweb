package br.edu.infnet.ecommerce.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TPedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer protocolo;
	private LocalDateTime data;
	private String observacao;
	private boolean encerrado;
	
	
	@ManyToOne(cascade = CascadeType.DETACH) //DETACH associa uma venda a uma chave primaria de um cliente ja previamente cadastrado
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	//@Transient eh usado quando nao for necessario associar um atributo a uma tabela.
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Produto> produtos;
	
	@ManyToOne(cascade = CascadeType.DETACH) //DETACH associa uma venda a uma chave primaria de um cliente ja previamente cadastrado
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	public Pedido() {
		data = LocalDateTime.now();
		
	}
	
//	@Override
//	public String toString() {
//		
//		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(protocolo);
//		sb.append(";");
//		sb.append(";");
//		sb.append(data.format(formato1));
//		sb.append(";");
//		sb.append(cliente.toString());
//		sb.append(";");
//		if(produtos != null) {
//			sb.append(produtos.size());
//		}
//
//		return sb.toString();
//	}

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean isEncerrado() {
		return encerrado;
	}

	public void setEncerrado(boolean encerrado) {
		this.encerrado = encerrado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
