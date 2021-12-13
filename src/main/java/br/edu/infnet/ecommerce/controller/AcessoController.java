package br.edu.infnet.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.service.ClienteService;
import br.edu.infnet.ecommerce.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}

	@PostMapping(value = "/login")
	public String telaIndex(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.autenticacao(email, senha);
		Cliente cliente = clienteService.autenticacao(email, senha);
		
		if(usuario != null ) {
			model.addAttribute("user", usuario);
			return "index";
		} else {
			if(cliente != null ) {
				model.addAttribute("user", cliente);
				return "index";
			} else {
			model.addAttribute("msg", "email +, usuario ou senha invalidos, tente novamente!");
			return "login";
		}
		}
	}
	
}
