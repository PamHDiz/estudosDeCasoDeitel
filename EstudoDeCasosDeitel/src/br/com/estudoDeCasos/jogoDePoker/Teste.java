package br.com.estudoDeCasos.jogoDePoker;

public class Teste {

	public static void main(String[] args) {
		
		DeckDeCartas meuDeck = new DeckDeCartas();
		meuDeck.embaralhar();
		
		for(int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", meuDeck.distribuidorDeCartas());
			
			if(i % 4 == 0) { // gera uma nova linha após a quarta carta
				System.out.println();
			}
		}

	}

}
