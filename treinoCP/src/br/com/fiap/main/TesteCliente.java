package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciar Objetos
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		//Entradas
		//Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		//Endereco
		objEndereco.setBairro(JOptionPane.showInputDialog("Qual seu bairro?"));
		objEndereco.setCep(JOptionPane.showInputDialog("Qual seu cep?"));
		objEndereco.setEstado(JOptionPane.showInputDialog("Qual seu estado?"));
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Qual o endereço?"));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Qual município?"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Qual o número?")));
		//Telefone
		objTelefone.setFoneCeluar("3662-3056");
		objTelefone.setFoneComercial("3662-3662");
		objTelefone.setFoneContato("555-3662");
		objTelefone.setFoneFixo("3333-3333");
		
		//Saída
		System.out.println("Nome: " + objCliente.getNome() + 
				"\nIdade: " + objCliente.getIdade() + 
				"\nPeso: " + objCliente.getPeso() + 
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
				"\nNumero residencia: " + objCliente.getEndereco().getNumero() + 
				"\nCEP: " + objCliente.getEndereco().getCep() + 
				"\nBairro: " + objCliente.getEndereco().getBairro() + 
				"\nMunicípio " + objCliente.getEndereco().getMunicipio() + 
				"\nEstado: " + objCliente.getEndereco().getEstado() + 
				"\nTelefone Celular: " + objCliente.getTelefone().getFoneCeluar());

	}

}
