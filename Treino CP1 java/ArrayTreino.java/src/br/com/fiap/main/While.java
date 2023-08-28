package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class While {
	
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
		
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		
		int continuar = 0;
		
		while (continuar ==0) {
			Produto objProduto = new Produto();
			objProduto.setMarca(texto("Qual a marca do produto: "));
			objProduto.setTipo(texto("Qual o tipo de produto: "));
			objProduto.setQuantidade(inteiro("Qual a quantidade: "));
			objProduto.setValor(decimal("Qual o valor do produto: "));
			
			listaProduto.add(objProduto);
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", 
					"Carrinho de compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}
		
	
		
		for (Produto p : listaProduto) {
			
			
			System.out.println("--------------------------"
					+"\nTipo de produto: " + p.getTipo()
					+"\nMarca do produto: " + p.getMarca()
					+"\nQuantidade: " + p.getQuantidade()
					+"\nValor: " + p.getValor());
		}

	}

}