package br.com.fiap.main;


import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHerança {
	
	//metodos static
	//String
	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro (String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//double
	static double real (String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		//Instanciar Objetos
		//String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Digite o nome da pessoa"),
				texto("Digite o email da pessoa"),
				inteiro("Digite a idade da pessoa"),
				real("Digite a renda da pessoa"),
				texto("Digite o RG da pessoa"),
				texto("Digite o CPF da pessoa"));
		
		
		//String logradouro
		Endereco objEndereco = new Endereco(texto("Informe o logradouro"));
		
		
		
		
		//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Digite o nome d aempresa"),
				texto("Digite o email da empresa"),
				inteiro("Digite o tempo de empresa"),
				real("Digite a renda da empresa"),
				texto("Digite a Razão Social"),
				texto("Digite o cnpj da empresa"));
		
		System.out.println("INFORMAÇÕES DA EMPRESA");
		System.out.println("Nome da Empresa" + objPessoaJuridica.getNome()+
				"\nCNPJ: " + objPessoaJuridica.getCnpj() + 
				"\nIdentificador: " + objPessoaJuridica.identificador() +
				"\nEndereço: " + objEndereco.getLogradouro());
		System.out.println("\nINFORMAÇÕES PESSOA FÍSICA");
		System.out.println("Nome: " + objPessoaFisica.getNome() + 
				"\nRG: " + objPessoaFisica.getRg() +
				"\nIdentificador: " + objPessoaFisica.identificador());
		
	}

}
