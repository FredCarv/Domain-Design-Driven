package br.com.fiap.excecao;

public class Excecao extends Exception{
	
	//Construtor
	public Excecao () {
		super();
		System.out.println("Mensagem de falha");
	}
	
	public Excecao(Exception e) {
		super();
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digitou outro caractere em vez de número");
		}else {
			System.out.println("Falha desconhecida");
		}
	}
	
}
