package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Anel;

@Repository
public interface AnelRepository extends CrudRepository<Anel, Integer> {

	List<Anel> findAll(Sort by); // por padrao, em uma interface nao eh necessario por visibilidade publica

}