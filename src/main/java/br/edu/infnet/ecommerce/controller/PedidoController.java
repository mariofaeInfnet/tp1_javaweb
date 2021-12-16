package br.edu.infnet.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Pedido;
import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.ClienteService;
import br.edu.infnet.ecommerce.model.service.PedidoService;
import br.edu.infnet.ecommerce.model.service.ProdutoService;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	ProdutoService produtoService;
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping(value = "/pedido")
	public String telaCompras(Model model) {
		
		model.addAttribute("produtos", produtoService.gerarLista());
		model.addAttribute("clientes", clienteService.obterLista());
		
		return "pedido/cadastro";
	}

	@GetMapping(value = "/pedidos")
	public String telaLista(Model model) {

		model.addAttribute("listaPedidos", pedidoService.obterLista());

		return "pedido/lista";
	}

	@PostMapping(value = "/pedido/incluir")
	public String incluir(@RequestParam String nome, Model model, Pedido pedido, @RequestParam String[] prodIds,@SessionAttribute("user") Usuario usuario) {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		pedido.setUsuario(usuario);
		
		for(String idProduto : prodIds) {
			
			produtoService.obterPorId(Integer.valueOf(idProduto));
			
			listaProdutos.add(null);
		}
		listaProdutos.add(null);
		pedido.setProdutos(listaProdutos);
		Cliente cliente = clienteService.obterPorNome(nome);
		pedido.setCliente(cliente);
		
		pedidoService.incluir(pedido);
		

		model.addAttribute("descricao", pedido.getData());

		return telaLista(model);
	}

	@GetMapping(value = "/pedido/{protocolo}/excluir")
	public String excluir(@PathVariable Integer protocolo) { 


		pedidoService.excluir(protocolo);

		return "redirect:/pedidos";
	}


}
