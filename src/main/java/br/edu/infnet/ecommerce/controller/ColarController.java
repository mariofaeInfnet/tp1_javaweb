package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ecommerce.model.domain.Colar;
import br.edu.infnet.ecommerce.model.service.ColarService;

@Controller
public class ColarController {

	@Autowired
	private ColarService colarService;
	
	@GetMapping(value = "/colar")
	public String telaCadastro() {
		return "colar/cadastro";
	}

	@GetMapping(value = "/colares")
	public String telaLista(Model model) {

		model.addAttribute("listaColares", colarService.obterLista());

		return "colar/lista";
	}

	@PostMapping(value = "/colar/incluir")
	public String incluir(Model model, Colar colar) {

		colarService.inserir(colar);

		model.addAttribute("descricao", colar.getDescricao());

		return telaLista(model);
	}

	@GetMapping(value = "/colar/{id}/excluir")
	public String excluir(@PathVariable Integer id, Model model) {
		try {
			colarService.excluir(id);
			model.addAttribute("mensagem2", "Produto excluído com sucesso!");
			
		} catch (Exception e) {
			model.addAttribute("mensagem", "Não é permitida a exclusão deste produto, pois existem pedidos associados a ele.");
		}
		
		return this.telaLista(model);
	}	
	
}
