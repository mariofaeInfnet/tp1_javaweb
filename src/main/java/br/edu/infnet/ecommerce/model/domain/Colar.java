package br.edu.infnet.ecommerce.model.domain;

import br.edu.infnet.ecommerce.model.exceptions.comprimentoInvalidoException;

public class Colar extends Produto {
	
	private int comprimento;
	private String pedra;
	private boolean corrente;

	public Colar(String descricao, boolean freteGratis, float precoVenda) {
		super(descricao, freteGratis, precoVenda);
	}

	@Override
	public float calcularDesconto() {
		//se corrente, desconto de 5% do valorVenda. 
		return (this.corrente ? getPrecoVenda() * 0.95f : getPrecoVenda());
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(comprimento);
		sb.append(";");
		sb.append(pedra);
		sb.append(";");
		sb.append(corrente ? "corrente" : "colar comum");
		sb.append(";");
		sb.append(calcularDesconto());

		return sb.toString();
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) throws comprimentoInvalidoException {
		
		if (comprimento <= 0) {
			throw new comprimentoInvalidoException("Impossível comprimento menor ou igual a zero");
		}
		
		this.comprimento = comprimento;
	}

	public String getPedra() {
		return pedra;
	}

	public void setPedra(String pedra) {
		this.pedra = pedra;
	}

	public boolean isCorrente() {
		return corrente;
	}

	public void setCorrente(boolean corrente) {
		this.corrente = corrente;
	}

}
