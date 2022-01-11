package br.com.estudoDeCasos.livroDeNotas;

public class TesteLivroDeNotas {

	public static void main(String[] args) {
		
		int[] arrayNotas = {55, 87, 63, 68, 94, 100, 83, 78, 85, 91, 76, 87, 35};
		
		LivroDeNotas minhasNotas = new LivroDeNotas("Java - Como Programar", arrayNotas);
		System.out.printf("Bem vindo ao livro de Notas para %n%s%n%n", 
				minhasNotas.getNomeDoCurso());
		minhasNotas.processadorDeNotas();
	}

}
