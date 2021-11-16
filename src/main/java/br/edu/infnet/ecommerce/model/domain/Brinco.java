package br.edu.infnet.ecommerce.model.domain;

import br.edu.infnet.ecommerce.model.exceptions.MaterialNullException;

public class Brinco extends Produto {
	
	private String material; //ouro, prata, aco
	private String estilo; //argola, stud, gota, cascata..
	private String publico; //feminino, kids, baby

	public Brinco(String descricao, boolean freteGratis, float precoVenda) {
		super(descricao, freteGratis, precoVenda);
	}

	@Override
	public float calcularDesconto() {
		
		//se material == ouro, desconto de 5% do valorVenda. 
		return (this.material == "ouro" ? getPrecoVenda() * 0.95f : getPrecoVenda());
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(material);
		sb.append(";");
		sb.append(estilo);
		sb.append(";");
		sb.append(publico);
		sb.append(";");
		sb.append(calcularDesconto());

		return sb.toString();
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) throws MaterialNullException {
		if (material == null) {
			throw new MaterialNullException("campo material nao pode ser nulo");
		}
		this.material = material;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}
	
	
	

}
