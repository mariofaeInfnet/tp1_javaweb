package br.edu.infnet.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Endereco;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner { //passar o mouse por cima de dataloader e clicar em implement, ele já traz o @overrride abaixo

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Quantidade de usuarios é " + usuarioService.count());
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Avenida Rio Marinho");
		endereco.setBairro("Boqueirao");
		endereco.setCep("29047660");
		endereco.setLocalidade("Sao Paulo");
		endereco.setUf("SP");
		endereco.setComplemento("apto 201");
		endereco.setNumero(50);
		
		Usuario usuario = new Usuario();
		usuario.setEmail("fulano@gmail.com");
		usuario.setNome("Fulano da Silva");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
		
		System.out.println("Quantidade de usuarios é " + usuarioService.count());
		
	}

}
