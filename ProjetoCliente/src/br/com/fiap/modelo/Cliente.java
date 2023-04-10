package br.com.fiap.modelo;

public class Cliente {
	
	// visibilidade, tipo de dado e nome da variavel
	private String nome; 
	private int idade;
	private double peso; 
	
	// setters (para entrada)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// getters (para saída)
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public double getPeso() {
		return peso;
	}
}
