package br.edu.infnet.ecommerce.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.ecommerce.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query("from Usuario u where u.email =:email and u.senha =:senha")
	public Usuario autenticacao(String email, String senha);

	public long count();

	public List<Usuario> findAll(Sort by);

}