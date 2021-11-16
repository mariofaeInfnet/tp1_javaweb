package br.edu.infnet.ecommerce.model.teste;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.domain.Brinco;
import br.edu.infnet.ecommerce.model.domain.Colar;
import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.exceptions.MaterialNullException;
import br.edu.infnet.ecommerce.model.exceptions.PublicoInvalidoException;
import br.edu.infnet.ecommerce.model.exceptions.comprimentoInvalidoException;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		

		try {
			Brinco brinco1 = new Brinco("crucifixo", true, 99);
			brinco1.setPublico("kids");
			brinco1.setMaterial("ouro");
			brinco1.setEstilo("gota");
			System.out.println(brinco1);
		} catch (MaterialNullException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			Brinco brinco2 = new Brinco("argola", false, 50);
			brinco2.setPublico("feminino");
			brinco2.setMaterial("ouro");
			brinco2.setEstilo("argola");
			System.out.println(brinco2.calcularDesconto());
		} catch (MaterialNullException e1) {
			System.out.println(e1.getMessage());
		}	
		
		try {
			Colar amazon = new Colar("the amazon", false, 80);
			amazon.setCorrente(false);
			amazon.setPedra("ametista");
			amazon.setComprimento(50);
			System.out.println(amazon);
		} catch (comprimentoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Colar canyon = new Colar("grand canyon", true, 150);
			canyon.setComprimento(15);
			canyon.setCorrente(true);
			canyon.setPedra("rubi");
			System.out.println(canyon.calcularDesconto());
		} catch (comprimentoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

		
	
		try {
			Anel alianca = new Anel("alicanca de noivado", true, 210);
			alianca.setPublico("feminino");
			alianca.setTamanho(2);
			alianca.setPedra("rubi");
			System.out.println(alianca);
		} catch (PublicoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Anel aliancinha = new Anel("alicanca de criança", false, 49);
			aliancinha.setPedra("ametista");
			aliancinha.setPublico("unisex");
			aliancinha.setTamanho(5);
			System.out.println(aliancinha);
		} catch (PublicoInvalidoException e) {
			System.out.println(e.getMessage());
		}


	}

}
