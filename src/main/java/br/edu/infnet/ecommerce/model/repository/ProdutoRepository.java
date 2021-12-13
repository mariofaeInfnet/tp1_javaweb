package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.domain.Usuario;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	List<Produto> findAll(Sort by);

}
