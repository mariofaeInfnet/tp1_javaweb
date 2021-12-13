package br.edu.infnet.ecommerce.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.clients.IEnderecoClient;
import br.edu.infnet.ecommerce.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private IEnderecoClient enderecoClient;
	
    public Endereco obterEnderecoPorCep(String cep) {


        return enderecoClient.buscarEnderecoCep(cep);
    }
	
}
