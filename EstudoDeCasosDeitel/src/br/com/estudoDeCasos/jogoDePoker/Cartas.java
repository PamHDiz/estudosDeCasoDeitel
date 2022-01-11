package br.com.estudoDeCasos.jogoDePoker;

public class Cartas {
	
	private final String valorCarta; //numero da carta (A, 2, 3,....)
	private final String naipe; 
	
	//construtor que inicializa o valor da carta e seu naipe
	public Cartas(String valorCarta, String naipe) {
		this.valorCarta = valorCarta;
		this.naipe = naipe;
	}
	
	public String toString() {
		return valorCarta + " de " + naipe;
	}
}
