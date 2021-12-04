package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
	@Query("from Cliente c where c.usuario.id =:id")
	public List<Cliente> obterLista(Integer id);

}
