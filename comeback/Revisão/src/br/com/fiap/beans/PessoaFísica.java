package br.com.fiap.beans;

public class PessoaFísica extends Pessoa{
	
	private String cpf;

	public PessoaFísica() {
		super();
	}
	
	

	public PessoaFísica(String nome, String email, int idade, double renda, String cpf) {
		super(nome, email, idade, renda);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String identificador() {
		
		return "INFORMAÇÕES, PESSOA FÍSICA";
	}

	@Override
	public double PagarTaxa() {
		double taxaRenda;
		
		if(renda > 2000) {
			return taxaRenda = renda * 12/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}

}
