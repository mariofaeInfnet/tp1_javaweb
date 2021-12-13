 package br.edu.infnet.ecommerce.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private boolean freteGratis;
	private float precoVenda;
	
	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos;
	
	@ManyToOne(cascade = CascadeType.DETACH) //para salvar o id do usuario que cadastrou o produto
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Produto() {
	}
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFreteGratis() {
		return freteGratis;
	}

	public void setFreteGratis(boolean freteGratis) {
		this.freteGratis = freteGratis;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}
