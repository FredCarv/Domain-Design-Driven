package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFísica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);		
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		// instanciar objetos
		//String nome, String email, int idade, double renda, String cpf
		PessoaFísica objPf = new PessoaFísica(texto("Informe o nome da Pessoa Física"),
											texto("email"),
											inteiro("idade"),
											real("renda"),
											texto("CPF"));
		
		//String nome, String email, int idade, double renda, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Informe o nome da Pessoa Juridica"),
												texto("email"),
												inteiro("idade"),
												real("renda"),
												texto("CNPJ"));
		
		System.out.println(objPf.identificador());
		System.out.println("Nome da pessoa física: " + objPf.getNome() +
				"\nCPF: " + objPf.getCpf() +
				"\nTaxa, Pessoa Física: " + objPf.PagarTaxa());
		
		System.out.println(objPj.identificador());
		System.out.println("Nome da Empresa: " + objPj.getNome()+ 
				"\nCNPJ: " + objPj.getCnpj() +
				"\nTaxa, Pessoa Juridica: " + objPj.PagarTaxa());
		
	}

}
