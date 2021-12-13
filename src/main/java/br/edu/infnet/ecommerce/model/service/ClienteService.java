package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> obterLista() {//traz todos os registros independente do usuario logado
		
		return (List<Cliente>)clienteRepository.findAll();
	}
	
	public List<Cliente> obterLista(Usuario usuario) {//traz somente os registros associados ao usuario logado
		
		return (List<Cliente>)clienteRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Cliente cliente) {

		
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		
		clienteRepository.deleteById(id);
		
	}
	
	public Cliente autenticacao(String email, String senha) {
		return clienteRepository.autenticacao(email, senha);
	}

}
