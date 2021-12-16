package br.edu.infnet.ecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.ecommerce.model.domain.Brinco;
import br.edu.infnet.ecommerce.model.repository.BrincoRepository;

@Service
public class BrincoService {

	
	@Autowired
	private BrincoRepository brincoRepository;
	
	public void inserir(Brinco brinco) {
		
		brincoRepository.save(brinco);
		
	}
	
	public void excluir(Integer id) {
		
		brincoRepository.deleteById(id);
		
	}
	
	public Brinco obterPorId(Integer id) {
		
		return brincoRepository.findById(id).orElse(null);
	}
	
	public List<Brinco> obterLista(){
		
		return (List<Brinco>) brincoRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}

}

