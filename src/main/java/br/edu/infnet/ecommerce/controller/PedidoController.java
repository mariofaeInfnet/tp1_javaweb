package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Pedido;
import br.edu.infnet.ecommerce.model.service.PedidoService;
import br.edu.infnet.ecommerce.model.service.ProdutoService;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping(value = "/pedido")
	public String telaCompras(Model model, Cliente cliente) {
		
		model.addAttribute("produtos", produtoService.gerarLista());
		
		return "pedido/cadastro"; //criar uma lista de todos os produtos
	}

	@GetMapping(value = "/pedidos")
	public String telaLista(Model model, Cliente cliente) {

		model.addAttribute("listaPedidos", pedidoService.obterLista());

		return "pedido/lista";
	}

	@PostMapping(value = "/pedido/incluir")
	public String incluir(Model model, Pedido pedido, @SessionAttribute("user") Cliente cliente) {
		
		pedido.setCliente(cliente);
		
		pedidoService.incluir(pedido);

		model.addAttribute("descricao", pedido.getData());

		return telaLista(model, cliente);
	}

	@GetMapping(value = "/pedido/{protocolo}/excluir")
	public String excluir(@PathVariable Integer protocolo) { 


		pedidoService.excluir(protocolo);

		return "redirect:/pedidos";
	}


}
