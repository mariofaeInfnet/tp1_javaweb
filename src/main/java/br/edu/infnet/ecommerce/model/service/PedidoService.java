package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Pedido;
import br.edu.infnet.ecommerce.model.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> obterLista() {//traz todos os registros independente do usuario logado
		
		return (List<Pedido>)pedidoRepository.findAll();
	}
	
	public List<Pedido> obterLista(Cliente cliente) {//traz somente os registros associados ao cliente logado
		
		return (List<Pedido>)pedidoRepository.findAll(cliente.getId(), Sort.by(Sort.Direction.ASC, "data"));
	}
	
	public void incluir(Pedido pedido) {

		
		pedidoRepository.save(pedido);
	}
	
	public void excluir(Integer id) {
		
		pedidoRepository.deleteById(id);
		
	}

}
