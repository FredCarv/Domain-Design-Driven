package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciar objetos
		
		Cliente objCliente = new Cliente();
		Telefone objTelefone = new Telefone();
		Endereco objEndereco = new Endereco();
		
		//Entradas
		//Cliente
		objCliente.setNome("Fred");
		objCliente.setIdade(24);
		objCliente.setPeso(75.25);
		objCliente.setEndereco(objEndereco);
		//Endereco
		objEndereco.setLogradouro("Rua sinistrona");
		objEndereco.setNumero(69);
		objEndereco.setBairro("Vila sinistra");
		objEndereco.setMunicipio("Sinistrópolis");
		objEndereco.setCep("696-9696");
		objEndereco.setEstado("Sinistro");
		objEndereco.setNacionalidade("Sinistrense");
		//Telefone
		objTelefone.setCelular("92103-4123");
		objTelefone.setCoemrcial("59392-0583");
		objTelefone.setContato("50182-4827");
		objTelefone.setFixo("91798-5173");
		
		//Saidas
		System.out.println("Nome: " + objCliente.getNome() + 
				"\nIdade: " + objCliente.getIdade() + 
				"\nPeso: " + objCliente.getPeso() + 
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + 
				"\nNumero: " + objCliente.getEndereco().getNumero() + 
				"\nBairro: " + objCliente.getEndereco().getBairro() + 
				"\nTelefone: " + objTelefone.getCelular());
	}
	

}
