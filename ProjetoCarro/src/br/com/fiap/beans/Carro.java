package br.com.fiap.beans;

public class Carro {

	// Visibilidade, tipo de dado, nome da variável
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	private Motor motor;
	
	//setters (Entradas)
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setMotor (Motor motor) {
		this.motor = motor;
	}
	
	// getters (exibir/saídas)
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Motor getMotor() {
		return motor;
	}
}
