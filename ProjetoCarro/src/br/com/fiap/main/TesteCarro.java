package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Motor;

public class TesteCarro {

	public static void main(String[] args) {
		
		// Instanciar objeto
		Carro objetoCarro = new Carro();
		Motor objetoMotor = new Motor();
		
		// Entradas 
		objetoCarro.setMarca("FIAT");
		objetoCarro.setModelo("Uno");
		objetoCarro.setAno(2015);
		objetoCarro.setValor(27.555);
		objetoCarro.setMotor(objetoMotor);
		
		objetoMotor.setMarcaMotor("General Motors");
		objetoMotor.setPotencia(1.6);
		objetoMotor.setTipoCambio("Manual");
		
		System.out.println("A marca do carro é " + objetoCarro.getMarca() + 
				"\n Modelo" + objetoCarro.getModelo() + "Ano " + objetoCarro.getModelo() +
				"\n Custa R$ " + objetoCarro.getValor() + " e tem o motor " + objetoCarro.getMotor() .getMarcaMotor() +
				"\nTipo de câmbio " + objetoCarro.getMotor().getTipoCambio() + " e potência " + objetoCarro.getMotor().getPotencia());

	}

}
