 package br.edu.infnet.ecommerce.model.domain;

public abstract class Produto {
	
	private String descricao;
	private boolean freteGratis;
	private float precoVenda;
	
	public Produto(String descricao, boolean freteGratis, float precoVenda) {
		this.descricao = descricao;
		this.freteGratis = freteGratis;
		this.precoVenda = precoVenda;
	}
	
	public abstract float calcularDesconto();
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(descricao);
		sb.append(";");
		sb.append(freteGratis ? "frete gratis" : "frete não gratis");
		sb.append(";");
		sb.append(precoVenda);
		
		return sb.toString();
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isFreteGratis() {
		return freteGratis;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	
	

}
