package br.com.fiap.main;


import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class doWhile{
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[5];
		
		int indice = 0;
		
		do {
			
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Digite o tipo de produto: "));
			vetorProduto[indice].setMarca(texto("Digite a marca do produto: "));
			vetorProduto[indice].setQuantidade(inteiro("Digite a quantidade desejada: "));
			vetorProduto[indice].setValor(decimal("Qual o valor do produto?"));
			
			indice++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de compras", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for (int contador = 0; contador < indice; contador++){
			System.out.println("---------------------------------"
								+"\nMarca: " + vetorProduto[contador].getMarca()
								+"\nTipo: " + vetorProduto[contador].getTipo()
								+"\nQuantidade: " + vetorProduto[contador].getQuantidade()
								+"\nValor: " + vetorProduto[contador].getValor());
		}
		
		

	}
}


	


