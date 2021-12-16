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
		//
		
		Cliente cliente2 = new Cliente("Joaquina de Assuncao", "joaquina@gmail.com", "123");
		cliente2.setUsuario(usuario);
		
		clienteService.incluir(cliente2);
		//
		Usuario usuario2 = new Usuario();
		usuario2.setId(2);
		
		Cliente cliente3 = new Cliente("Zoniaria dos Ventos", "zoniara@gmail.com", "123");
		cliente3.setUsuario(usuario2);
		
		clienteService.incluir(cliente3);
		//
		
		Cliente cliente4 = new Cliente("Alinina Natal", "alinina@gmail.com", "123");
		cliente4.setUsuario(usuario2);
		
		clienteService.incluir(cliente4);
	}

}
