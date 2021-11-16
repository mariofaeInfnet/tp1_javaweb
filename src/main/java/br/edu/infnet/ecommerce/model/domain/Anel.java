package br.edu.infnet.ecommerce.model.domain;

import br.edu.infnet.ecommerce.model.exceptions.PublicoInvalidoException;

public class Anel extends Produto {
	
	private int tamanho;
	private String pedra;
	private String publico; //masculino, feminino ou unisex

	public Anel(String descricao, boolean freteGratis, float precoVenda) {
		super(descricao, freteGratis, precoVenda);
		
	}

	@Override
	public float calcularDesconto() {
		return (publico == "masculino" ? getPrecoVenda() * 0.95f : getPrecoVenda());

	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getPedra() {
		return pedra;
	}

	public void setPedra(String pedra) {
		this.pedra = pedra;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) throws PublicoInvalidoException {
		
		if (publico != "masculino" && publico != "feminino" && publico != "unisex") {
			throw new PublicoInvalidoException("Impossivel processar o publico inserido");
		}
		
		this.publico = publico;
	}

}
