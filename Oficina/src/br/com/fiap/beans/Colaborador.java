package br.com.fiap.beans;

public class Colaborador {
	
	//variáveis
	private String nome;
	private int idade;
	private String rg;
	private String cargo;
	private double salario;
	
	//método construtor vazio
	public Colaborador() {
		super();
	}

	//método construtor cheio
	public Colaborador(String nome, int idade, String rg, String cargo, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cargo = cargo;
		this.salario = salario;
	}

	//setters (entrada) e getters (saída)
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getsalario() {
		return salario;
	}

	public void setsalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
}
