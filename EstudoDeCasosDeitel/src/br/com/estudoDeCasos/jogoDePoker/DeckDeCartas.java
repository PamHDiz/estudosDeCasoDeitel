package br.com.estudoDeCasos.jogoDePoker;

import java.security.SecureRandom;

public class DeckDeCartas {
	
	private Cartas[] deck; // Array do tipo Cartas
	private int proximaCarta; // índice da próxima carta a ser dada (0 - 51)
	private static final int NUMERO_DE_CARTAS = 52; 
	private static final SecureRandom numeroRandom = new SecureRandom(); // gerador de número aleatório
	
	public DeckDeCartas() {
		String[] valorCarta = {"A", "2", "3", "4", "5", "6", "7",
				"8", "9", "10", "J", "Q", "K"};
		String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
		
		deck = new Cartas[NUMERO_DE_CARTAS]; // cria array de objetos Card
		proximaCarta = 0; // primeira carta distribuida será o deck[0]
		
		for(int contador = 0; contador < deck.length; contador++) {
			deck[contador] = new Cartas(valorCarta[contador % 13], naipes[contador / 13]);
		}
	}
	// embaralha as cartas
	public void embaralhar() {
		proximaCarta = 0;
		
		for(int primeira = 0; primeira < deck.length; primeira++) {
			//seleciona um número aleatório entre 0 e 51
			int segunda = numeroRandom.nextInt(NUMERO_DE_CARTAS);
			
			Cartas temp = deck[primeira];
			deck[primeira] = deck[segunda];
			deck[segunda] = temp;
		}
	}
	// distribui cartas
	public Cartas distribuidorDeCartas() {
		
		//verifica se ainda há cartas para serem distribuídas
		if(proximaCarta < deck.length) {
			return deck[proximaCarta++]; // retorna a Carta atual
		} else {
			return null;
		}
	}
}
