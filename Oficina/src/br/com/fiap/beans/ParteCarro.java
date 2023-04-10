package br.com.fiap.beans;

public class ParteCarro {
	
	//variáveis
	private String motor;
	private String combustivel;
	private String roda;
	
	
	//método construtor vazio
	public ParteCarro() {
		super();
	}

	//método construtor cheio
	public ParteCarro(String motor, String combustivel, String roda) {
		super();
		this.motor = motor;
		this.combustivel = combustivel;
		this.roda = roda;
	}
	
	//setters e getters
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getcombustivel() {
		return combustivel;
	}

	public void setcombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}
	
	
	

}
