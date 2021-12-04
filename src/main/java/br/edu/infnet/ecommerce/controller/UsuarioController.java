package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/usuario/cadastro")
	public String telaCadastroUsuario() {
		return "usuario/cadastro";
	}
	
	@GetMapping(value = "/usuarios")
	public String telaLista(Model model) {

		model.addAttribute("listaUsuarios", usuarioService.gerarLista());
		return "usuario/lista";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model	model, Usuario usuario) {
		
		usuarioService.incluir(usuario);
		
		return "index";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {		//@Pathv. para o método entender que a variável "id" está vindo da rota informada acima.
		
		//exclui um registro através de um id
		usuarioService.excluir(id);
		
		return "redirect:/usuarios";
	}
	
}
