package br.com.fiap.beans;

public class Carro {
	
	//variáveis
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	private ParteCarro parteCarro;
	
	//metodo construtor vazio
	public Carro() {
		super();
	}

	//Metodo construtor sem atributos de referencia
	public Carro(String marca, String modelo, int ano, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	//metodo construtor cheio
	public Carro(String marca, String modelo, int ano, double valor, ParteCarro parteCarro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.parteCarro = parteCarro;
	}
	
	
	//setters (entrada) e getters (saída)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ParteCarro getParteCarro() {
		return parteCarro;
	}

	public void setParteCarro(ParteCarro parteCarro) {
		this.parteCarro = parteCarro;
	}
	
	
	
	
	
	
	
	
}
