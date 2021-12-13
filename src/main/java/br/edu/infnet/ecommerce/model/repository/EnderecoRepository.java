package br.edu.infnet.ecommerce.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> { //O tipo do crud(Endereco e a chave primaria do tipo



}
	