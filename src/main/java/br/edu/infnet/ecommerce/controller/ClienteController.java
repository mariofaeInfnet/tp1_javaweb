package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}
	
	@GetMapping(value = "/clientes")
	public String telaLista(Model model) {
		
		model.addAttribute("listaClientes", clienteService.obterLista());
		
		return "cliente/lista";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Model	model, Cliente cliente) {
		
		clienteService.incluir(cliente);
		System.out.println("A inclusao do "+ cliente.getNome() +" foi realizada com sucesso!!!");
		
		model.addAttribute("nome", cliente.getNome());

		
		return "cliente/confirmacao";
	}

}