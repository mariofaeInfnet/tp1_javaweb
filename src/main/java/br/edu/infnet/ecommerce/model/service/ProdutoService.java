package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public List<Produto> gerarLista() {
		return (List<Produto>) produtoRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao")); //usar a sugestão do eclipse "cast" para converter o tipo de coleção de iterable para list.
	}	
	
	

}
