package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.repository.AnelRepository;

@Service
public class AnelService {
	
	@Autowired
	private AnelRepository anelRepository;
	
	public void inserir(Anel anel) {
		
		anelRepository.save(anel);
		
	}
	
	public void excluir(Integer id) {
		
		anelRepository.deleteById(id);
		
	}
	
	public Anel obterPorId(Integer id) {
		
		return anelRepository.findById(id).orElse(null);
	}
	
	public List<Anel> obterLista(){
		
		return (List<Anel>) anelRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}

}
