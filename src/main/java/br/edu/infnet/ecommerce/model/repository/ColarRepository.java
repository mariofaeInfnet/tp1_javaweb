package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Colar;

@Repository
public interface ColarRepository extends CrudRepository<Colar, Integer>{

	List<Colar> findAll(Sort by);

}
