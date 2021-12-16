package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Colar;
import br.edu.infnet.ecommerce.model.repository.ColarRepository;

@Service
public class ColarService {

	@Autowired
	private ColarRepository colarRepository;
	
	public void inserir(Colar colar) {
		
		colarRepository.save(colar);
		
	}
	
	public void excluir(Integer id) {
		
		colarRepository.deleteById(id);
		
	}
	
	public Colar obterPorId(Integer id) {
		
		return colarRepository.findById(id).orElse(null);
	}
	
	public List<Colar> obterLista(){
		
		return (List<Colar>) colarRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}

}

	
