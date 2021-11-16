package br.edu.infnet.ecommerce.model.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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




public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "vendas.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] indices;
				
				linha = leitura.readLine();
				
				List<Produto> listaProdutos = new ArrayList<Produto>();
				Venda venda1 = new Venda();

				while(linha != null) {
					
					indices = linha.split(";");
					
					if(indices.length == 5) {
						Cliente cliente = new Cliente(
								indices[2], 
								indices[3], 
								indices[4]
							);
						
						venda1.setProtocolo(Integer.valueOf(indices[0]));
						venda1.setCliente(cliente);
						venda1.setValorTotal(Float.valueOf(indices[1]));
							
					} else {
						switch (indices[0]) {
						case "C":
							Colar trento = new Colar(
									indices[1],
									Boolean.valueOf(indices[2]),
									Float.valueOf(indices[3])
									);
							try {
								trento.setComprimento(Integer.valueOf(indices[4]));
								trento.setPedra(indices[5]);
								trento.setCorrente(Boolean.valueOf(indices[6]));
								
								listaProdutos.add(trento);

							} catch (comprimentoInvalidoException | NumberFormatException e) {
								System.out.println(e.getMessage());
							}

							break;

						case "A":
							
							Anel anel1 = new Anel( indices[1], Boolean.valueOf(indices[2]),
							Float.valueOf(indices[3]) );
							listaProdutos.add(anel1);
							
							try {
								anel1.setPedra(indices[4]);
								anel1.setPublico (indices[5]);
								anel1.setTamanho(Integer.valueOf(indices[6]));
								
								listaProdutos.add(anel1);
							} catch (PublicoInvalidoException e1) {
								System.out.println(e1.getMessage());
							}
							
							 
							break;

						case "B":

							Brinco black = new Brinco(
									indices[1],
									Boolean.valueOf(indices[2]),
									Float.valueOf(indices[3])
									);
							try {
								black.setMaterial(indices[4]);
								black.setEstilo(indices[5]);
								black.setPublico(indices[6]);
								
								listaProdutos.add(black);

							} catch (MaterialNullException e) {
								System.out.println(e.getMessage());
							}
							break;
							
						default:
							System.out.println("Pedido sem tipo!!!");
							
							break;
						}
					}					

					linha = leitura.readLine();
				}
				
				venda1.setProdutos(listaProdutos);

				
				for(Produto prdt : venda1.getProdutos()) {
					
					escrita.write(
							venda1.getProtocolo()+";"+
							venda1.getCliente().getNome()+";"+
							prdt.getDescricao()+";"+
							prdt.calcularDesconto()+"\r\n");
				}


				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
	}
}