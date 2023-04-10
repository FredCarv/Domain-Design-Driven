package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto objProduto = new Produto();
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite o nome"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o peso")),
				objProduto);
		
	
		/*
		objCliente.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?")) );
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?")));
		objCliente.setProduto(objProduto);
		*/
		
		objProduto.setTipo(JOptionPane.showInputDialog("Que tipo de produto?"));
		objProduto.setMarca("Nike");
		objProduto.setQuantidade(3);
		objProduto.setValor(49.99);
		
		System.out.println(
				"Nome: " + objCliente.getNome() + 
				"\nIdade: " + objCliente.getIdade() + 
				"\nPeso: " + objCliente.getPeso() + 
				"\nProduto: " + objCliente.getProduto().getTipo() + 
				"\nMarca: " + objCliente.getProduto().getMarca() + 
				"\nQuantidade: " + objCliente.getProduto().getQuantidade() +
				"\nValor: " + objCliente.getProduto().getValor());
	}

}
