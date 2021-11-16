package br.edu.infnet.ecommerce.model.teste;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.ecommerce.model.domain.Anel;
import br.edu.infnet.ecommerce.model.domain.Brinco;
import br.edu.infnet.ecommerce.model.domain.Cliente;
import br.edu.infnet.ecommerce.model.domain.Colar;
import br.edu.infnet.ecommerce.model.domain.Produto;
import br.edu.infnet.ecommerce.model.domain.Venda;
import br.edu.infnet.ecommerce.model.exceptions.MaterialNullException;
import br.edu.infnet.ecommerce.model.exceptions.PublicoInvalidoException;
import br.edu.infnet.ecommerce.model.exceptions.comprimentoInvalidoException;

public class VendaTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("jose mario", "33250110", "mario@gmail.com");
		
		Brinco black = new Brinco("black", true, 200);
		try {
			black.setEstilo("argola");
			black.setMaterial("ouro");
			black.setPublico("feminino");
		} catch (MaterialNullException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		Colar trento = new Colar("trento", false, 150);
		try {
			trento.setComprimento(60);
			trento.setCorrente(false);
			trento.setPedra("ametista");
		} catch (comprimentoInvalidoException e) {
			System.out.println(e.getMessage());
		}

		
		Colar havaiano = new Colar("havaiano", false, 25);
		try {
			havaiano.setComprimento(80);
			havaiano.setCorrente(false);
			havaiano.setPedra("petalas");
		} catch (comprimentoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		Anel alianca = new Anel("alicanca de noivado", true, 210);
		try {
			
			alianca.setPublico("feminino");
			alianca.setTamanho(2);
			alianca.setPedra("rubi");

		} catch (PublicoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		List<Produto> listaCompras1 = new ArrayList<Produto>();
		listaCompras1.add(black);
		listaCompras1.add(trento);
		
		List<Produto> listaCompras2 = new ArrayList<Produto>();
		listaCompras2.add(havaiano);
		listaCompras2.add(alianca);
		
		
		
		Venda venda1 = new Venda();
		venda1.setProtocolo(1001);
		venda1.setCliente(cliente);
		venda1.setValorTotal(300);
		venda1.setProdutos(listaCompras1);
		System.out.println(venda1);
		
		Venda venda2 = new Venda();
		venda2.setProtocolo(1002);
		venda2.setCliente(cliente);
		venda2.setValorTotal(452);
		venda2.setProdutos(listaCompras2);
		System.out.println(venda2);
		
	}

}
