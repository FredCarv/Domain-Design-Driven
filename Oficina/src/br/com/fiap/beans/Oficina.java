package br.com.fiap.beans;

public class Oficina {
	
	//Variáveis
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Carro carro;
	private Colaborador colaborador;
	
	//método construtor
	public Oficina() {
		super();
	}
	
	
	//Metodo construtor sem atributos de referencia
	public Oficina(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	//Método construtor cheio
	public Oficina(String nome, String cnpj, Endereco endereco, Carro carro, Colaborador colaborador) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.carro = carro;
		this.colaborador = colaborador;
	}

	
	//setters (entrada) e getters (saída)
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public Colaborador getColaborador() {
		return colaborador;
	}


	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	
	
}
