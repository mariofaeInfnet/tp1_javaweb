package br.edu.infnet.ecommerce.model.teste;

import br.edu.infnet.ecommerce.model.domain.Cliente;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("jose mario", "33250110", "mario@gmail.com");
		System.out.println(cliente);
	}

}
