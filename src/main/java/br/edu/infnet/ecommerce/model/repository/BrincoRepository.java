package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Brinco;

@Repository
public interface BrincoRepository extends CrudRepository<Brinco, Integer>{

	List<Brinco> findAll(Sort by);

}
