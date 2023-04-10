package br.com.fiap.beans;

public class Motor {
	
	//Visibilidade, tipo de dado e nome
	private String marcaMotor;
	private double potencia;
	private String tipoCambio;
	
	// setters (entrada)
	public void setMarcaMotor (String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}
	
	public void setPotencia (double potencia) {
		this.potencia = potencia;
	}
	
	public void setTipoCambio (String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	// getters (saída)
	public String getMarcaMotor () {
		return marcaMotor;
	}
	
	public double getPotencia () {
		return potencia;
	}
	
	public String getTipoCambio () {
		return tipoCambio;
	}
}
