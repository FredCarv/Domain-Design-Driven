package br.com.fiap.beans;

public class Endereco {
	//variaveis
	private  String logradouro, cep;
	private int numero;
	
	//metodo construtor vazio
	public Endereco() {
		super();
	}
	
	//metodo construtor cheio
	public Endereco(String logradouro, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
	}

	//setters e getters
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
