package br.com.fiap.beans;

public class Cliente {
	//visibilidade, tipo de dado e nome da variável
	private String nome;
	private int idade;
	private double peso;
	private Produto produto;
	
	//Metodo Construtor vazio
	public Cliente () {
		super();
	}
	
	//Metodo Construtor cheio
	public Cliente (String nome, int idade, double peso, Produto produto) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.produto = produto;
	}
	
	//metodo construtor vazio
	
	//metodo construtor cheio
	
	//getters e seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
