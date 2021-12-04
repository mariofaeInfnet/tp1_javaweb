package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Usuario;
import br.edu.infnet.ecommerce.model.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;	
	
	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> gerarLista() {
		return (List<Usuario>) usuarioRepository.findAll(); //usar a sugestão do eclipse "cast" para converter o tipo de coleção de iterable para list.
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	

}
