package br.edu.infnet.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.domain.Brinco;
import br.edu.infnet.ecommerce.model.domain.Colar;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.AnelService;
import br.edu.infnet.ecommerce.model.service.BrincoService;
import br.edu.infnet.ecommerce.model.service.ColarService;

@Order(3)
@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private AnelService anelService;
	
	@Autowired
	private BrincoService brincoService;
	
	@Autowired
	private ColarService colarService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Anel anel = new Anel("anel de ouro", true, 100);
			anel.setPedra("sem");
			anel.setPublico("masculino");
			anel.setTamanho(3);
			anel.setUsuario(usuario);
			anelService.inserir(anel);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Anel anel = new Anel("Anel Zuado", true, 57);
			anel.setPedra("ruby");
			anel.setPublico("feminino");
			anel.setTamanho(2);
			anel.setUsuario(usuario);
			anelService.inserir(anel);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Anel anel = new Anel("Anel quadrado", false, 164);
			anel.setPedra("sem ornamento");
			anel.setPublico("unisex");
			anel.setTamanho(6);
			anel.setUsuario(usuario);
			anelService.inserir(anel);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Brinco brinco = new Brinco("Brinco Qualquer", true, 100);
			brinco.setEstilo("Argola");
			brinco.setPublico("feminino");
			brinco.setMaterial("ouro");
			brinco.setUsuario(usuario);
			brincoService.inserir(brinco);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Brinco brinco = new Brinco("Brinco Diamante", true, 72);
			brinco.setEstilo("Cruz preta");
			brinco.setPublico("masculino");
			brinco.setMaterial("plastico");
			brinco.setUsuario(usuario);
			brincoService.inserir(brinco);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Brinco brinco = new Brinco("Brinco Bbbbbb", false, 57);
			brinco.setEstilo("Rococo");
			brinco.setPublico("unisex");
			brinco.setMaterial("Inox");
			brinco.setUsuario(usuario);
			brincoService.inserir(brinco);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Usuario usuario2 = new Usuario();
			usuario2.setId(2);
			
			Colar colar = new Colar("Corrente de Ouro", false, 3000);
			colar.setComprimento(40);
			colar.setCorrente(true);
			colar.setPedra("Inox");
			colar.setUsuario(usuario2);
			colarService.inserir(colar);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
