package br.edu.infnet.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.repository.UsuarioRepository;

@Component
public class DataLoader implements ApplicationRunner { //passar o mouse por cima de dataloader e clicar em implement, ele já traz o @overrride abaixo

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Quantidade de usuarios é " + usuarioRepository.count());
		
		Usuario usuario = new Usuario();
		usuario.setEmail("jose@hotmail.com");
		usuario.setNome("Jose Mario Fae");
		usuario.setSenha("123");
		
		usuarioRepository.save(usuario);
		
		System.out.println("Quantidade de usuarios é " + usuarioRepository.count());
		
	}

}
