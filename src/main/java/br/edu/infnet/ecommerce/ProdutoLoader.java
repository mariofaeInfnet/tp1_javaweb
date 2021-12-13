package br.edu.infnet.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.AnelService;

@Order(3)
@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private AnelService anelService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Anel anel = new Anel("anel de ouro", true, 100);
			anel.setPedra("ametista");
			anel.setPublico("feminino");
			anel.setTamanho(3);
			anel.setUsuario(usuario);
			anelService.inserir(anel);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
