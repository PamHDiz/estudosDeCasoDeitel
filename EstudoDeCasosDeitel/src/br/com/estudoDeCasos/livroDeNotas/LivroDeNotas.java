package br.com.estudoDeCasos.livroDeNotas;

public class LivroDeNotas {
	
	private String nomeDoCurso; //nome do curso que representa
	private int[] notas; //array de notas dos alunos
	
	public LivroDeNotas(String nomeDoCurso, int[] notas) {
		this.nomeDoCurso = nomeDoCurso;
		this.notas = notas;
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	
	//realiza várias operações com as notas
	public void processadorDeNotas() {
			
		//outPutGrades(); // gera a saída do Array de Notas
	}
	
	public int getMenorNota() {
		
		int menorNota = notas[0];
		
		//faz um loop pelo array de notas
		for(int nota : notas) {
			//se a nota for a mais baixa que menorNota, atribui esse valor a menorNota
			if(nota < menorNota) {
				menorNota = nota; // nova nota mais baixa
			}
		}
		return menorNota;
	}
	
}
