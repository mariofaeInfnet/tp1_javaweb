package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ecommerce.model.domain.Brinco;
import br.edu.infnet.ecommerce.model.service.BrincoService;

@Controller
public class BrincoController {

	@Autowired
	private BrincoService brincoService;
	
	@GetMapping(value = "/brinco")
	public String telaCadastro() {
		return "brinco/cadastro";
	}

	@GetMapping(value = "/brincos")
	public String telaLista(Model model) {

		model.addAttribute("listaBrincos", brincoService.obterLista());

		return "brinco/lista";
	}

	@PostMapping(value = "/brinco/incluir")
	public String incluir(Model model, Brinco brinco) {

		brincoService.inserir(brinco);

		model.addAttribute("descricao", brinco.getDescricao());

		return telaLista(model);
	}

	@GetMapping(value = "/brinco/{id}/excluir")
	public String excluir(@PathVariable Integer id, Model model) {
		
		try {
			brincoService.excluir(id);
			model.addAttribute("mensagem2", "Produto excluído com sucesso!");
			
		} catch (Exception e) {
			model.addAttribute("mensagem", "Não é permitida a exclusão deste produto, pois existem pedidos associados a ele.");
		}
		
		return this.telaLista(model);
	}

	
}
