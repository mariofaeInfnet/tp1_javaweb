package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> obterLista() {
		
		return (List<Cliente>)clienteRepository.findAll();
	}
	
	public void incluir(Cliente cliente) {
//		cliente.setId(++id);
		
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		
		clienteRepository.deleteById(id);
		
	}

}
