package br.edu.infnet.ecommerce.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Venda {
	
	private int protocolo;
	private float valorTotal;
	private LocalDateTime data;
	private Cliente cliente; //relacionamento 1 para 1
	private List<Produto> produtos;

	
	public Venda() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		
		StringBuilder sb = new StringBuilder();
		sb.append(protocolo);
		sb.append(";");
		sb.append(valorTotal);
		sb.append(";");
		sb.append(data.format(formato1));
		sb.append(";");
		sb.append(cliente.toString());
		sb.append(";");
		if(produtos != null) {
			sb.append(produtos.size());
		}

		return sb.toString();
	}
	
	public int getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
