package br.edu.infnet.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.ClienteService;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente cliente = new Cliente("Ciclano Aparecido Souza", "ciclano@gmail.com", "123");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
	}

}
