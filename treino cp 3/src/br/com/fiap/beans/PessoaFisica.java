package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{
	
	//variaveis
	private String rg;
	private String cpf;
	
	//metodo construtor vazio
	public PessoaFisica() {
		super();
	}

	//metodo construtor cheio
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	//construtor cheio com herança
	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}

	//setters e getters
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String identificador(){
		return "PF";
	}
	
	
}
