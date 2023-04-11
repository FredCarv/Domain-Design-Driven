package br.com.fiap.beans;

public class ParteCarro {
	
	private String motor, combustivel, roda;
	
	//metodo construtor vazio
	public ParteCarro() {
		super();
	}
	
	//metodo construtor cheio
	public ParteCarro(String motor, String combustivel, String roda) {
		super();
		this.motor = motor;
		this.combustivel = combustivel;
		this.roda = roda;
	}
	
	
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}
	
	
	
}
