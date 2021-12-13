package br.edu.infnet.ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Pedido;
import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.PedidoService;

@Order(4)
@Component
public class PedidoLoader implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Anel anel = new Anel();
			anel.setId(1);
			
			Cliente cliente = new Cliente();
			cliente.setId(1);
			
			List<Produto> listaProdutos = new ArrayList<Produto>();
			listaProdutos.add(anel);
			
			Pedido pedido = new Pedido();
			pedido.setCliente(cliente);
			pedido.setProdutos(listaProdutos);
			pedido.setObservacao("favor embalar para presente");
			pedido.setEncerrado(true);
			
			pedidoService.incluir(pedido);

	}

}
