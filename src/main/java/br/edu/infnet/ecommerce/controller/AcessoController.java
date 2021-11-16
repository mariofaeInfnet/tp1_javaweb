package br.edu.infnet.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {

	@GetMapping(value = "/")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String telaIndex(Model model, @RequestParam String email, @RequestParam String senha) {
		if(email.equalsIgnoreCase(senha)) {
			return "index";
		} else {
			model.addAttribute("msg", "email +, usuario ou senha invalidos, tente novamente!");
			
			return "login";
		}
	}
	
}
