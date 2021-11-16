package br.edu.infnet.ecommerce.model.exceptions;

public class comprimentoInvalidoException extends Exception {
	
	public comprimentoInvalidoException(String mensagem) {
		super(mensagem);  //passando a mensagem para classe mãe
	}

}
