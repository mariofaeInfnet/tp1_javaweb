package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Usuario;
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
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaClientes", clienteService.obterLista(usuario));
		
		return "cliente/lista";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Model	model, Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
		
		model.addAttribute("nome", cliente.getNome());
		
//		model.addAttribute("listaClientes", clienteService.obterLista());
		
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {		//@Pathv. para o método entender que a variável "id" está vindo da rota informada acima.
		
		//exclui um aluno através de um id
		clienteService.excluir(id);
		
		return "redirect:/clientes";
	}

}