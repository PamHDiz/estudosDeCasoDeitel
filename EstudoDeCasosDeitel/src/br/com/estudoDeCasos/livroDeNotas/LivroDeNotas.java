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
	
	//realiza v�rias opera��es com as notas
	public void processadorDeNotas() {
			
		outPutNotas(); // gera a sa�da do Array de Notas
		
		System.out.printf("%nA m�dia da Classe � %.2f%n", getMedia());
		//chama m�todo getMedia para calcular a nota m�dia da classe
		
		System.out.printf("A menor nota � %d%nA maior nota � %d%n%n", 
				getMenorNota(), getMaiorNota());
		//chama os m�todos getMenorNota e getMaiorNota
		
		outPutGraficoBarras();
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
	
	public int getMaiorNota() {
		
		int maiorNota = this.notas[0];
		
		for(int nota : this.notas) {
			if(nota > maiorNota) {
				maiorNota = nota;
			}
		}
		return maiorNota;
	}
	//calcula a m�dia de notas
	public double getMedia() {
		
		int total = 0;
		
		for(int nota : this.notas) {
			total += nota;
		}
		return (double) total / this.notas.length;
	}
	
	//gera a sa�da do gr�fico de barras que exibe a distribui��o de notas
	public void outPutGraficoBarras() {
		
		System.out.println("Distribui��o de notas:");
		
		//armazena frequ�ncia de notas num intervalo de 10 notas
		int[] frequencia = new int[11];
		
		for(int nota : this.notas) { 
			++frequencia[nota / 10]; // para cada nota, incrementa a frequ�ncia apropriada
		}
		
		for(int i = 0; i < frequencia.length; i++) {
			//gera sa�da do t�tulo do intervalo de notas("00-09: ", ...)
			if(i == 10) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}
			//imprime barra de aster�sco
		for(int estrela = 0; estrela < frequencia[i]; estrela++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
	}
	//gera sa�da do conte�do do array de notas
	public void outPutNotas() {
		System.out.printf("As notas s�o:%n%n");
		
		//gera sa�da de nota de cada aluno
		for(int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d: %3d%n", 
					estudante + 1, notas[estudante]);
		}
	}
}
