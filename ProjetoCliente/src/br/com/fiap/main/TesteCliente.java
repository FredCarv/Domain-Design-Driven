package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		// Instancia / objeto
		Cliente objetoCliente = new Cliente();
		
		// Entrada
		objetoCliente.setNome("Braufagélio");
		objetoCliente.setIdade(38);
		objetoCliente.setPeso(75.3);
		
		
		// saída
		System.out.println(objetoCliente.getNome());
		System.out.println(objetoCliente.getIdade());
		System.out.println(objetoCliente.getPeso());
		System.out.println("Seu nome é " + objetoCliente.getNome() + ", sua idade é " + objetoCliente.getIdade() + " e seu peso é " + objetoCliente.getPeso());
	}

}
