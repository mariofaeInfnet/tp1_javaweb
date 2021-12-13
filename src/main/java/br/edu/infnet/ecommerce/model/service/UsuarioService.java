package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome")); //usar a sugestão do eclipse "cast" para converter o tipo de coleção de iterable para list.
	}														//usar a sugestao de engenharia reversa para criar o sort dentro do repository

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public long count() {
		long qtde = usuarioRepository.count();
		return qtde;
	}
	

}
