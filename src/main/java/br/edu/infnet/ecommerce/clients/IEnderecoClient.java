package br.edu.infnet.ecommerce.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.ecommerce.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viaCepService")
public interface IEnderecoClient {
	
    @GetMapping("{cep}/json")
    Endereco buscarEnderecoCep(@PathVariable("cep") String cep);

}
