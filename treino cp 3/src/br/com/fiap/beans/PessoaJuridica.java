package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	
	//construtor vazio
	public PessoaJuridica() {
		super();
	}
	
	//construtor chieo
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	//construtor cheio com heran�a
	public PessoaJuridica (String nome, String email, int idade, double renda, String razaoSocial, String cnpj){
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	//setters e getters
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String identificador(){
		return "PJ";
	}
	
	
}
