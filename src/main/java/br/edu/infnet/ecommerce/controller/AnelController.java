package br.edu.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.service.AnelService;

@Controller
public class AnelController {

	@Autowired
	private AnelService anelService;
	
	@GetMapping(value = "/anel")
	public String telaCadastro() {
		return "anel/cadastro";
	}

	@GetMapping(value = "/aneis")
	public String telaLista(Model model) {

		model.addAttribute("listaAneis", anelService.obterLista());

		return "anel/lista";
	}

	@PostMapping(value = "/anel/incluir")
	public String incluir(Model model, Anel anel) {

		anelService.inserir(anel);

		model.addAttribute("descricao", anel.getDescricao());

		return telaLista(model);
	}

	@GetMapping(value = "/anel/{id}/excluir")
	public String excluir(@PathVariable Integer id, Model model) { // @Pathv. para o método entender que a variável "id" está vindo
														// da rota informada acima.
		try {
			anelService.excluir(id);
			model.addAttribute("mensagem2", "Produto excluído com sucesso!");
			
		} catch (Exception e) {
			model.addAttribute("mensagem", "Não é permitida a exclusão deste produto, pois existem pedidos associados a ele.");
		}
		
		return this.telaLista(model);
	}

}