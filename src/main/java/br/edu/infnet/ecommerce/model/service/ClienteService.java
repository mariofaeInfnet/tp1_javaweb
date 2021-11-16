package br.edu.infnet.ecommerce.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Cliente;

@Service
public class ClienteService {
	
	private static List<Cliente> lista = new ArrayList<Cliente>();
//	private static Integer id;
	
	public List<Cliente> obterLista() {
		
		return lista;
	}
	
	public void incluir(Cliente cliente) {
//		cliente.setId(++id);
		
		lista.add(cliente);
	}

}
