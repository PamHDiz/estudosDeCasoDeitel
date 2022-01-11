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
		
	}
	
}
