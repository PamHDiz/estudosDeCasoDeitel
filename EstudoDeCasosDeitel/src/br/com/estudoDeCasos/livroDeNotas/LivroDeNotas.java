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
			
		outPutNotas(); // gera a saída do Array de Notas
		
		System.out.printf("%nA média da Classe é %.2f%n", getMedia());
		//chama método getMedia para calcular a nota média da classe
		
		System.out.printf("A menor nota é %d%nA maior nota é %d%n%n", 
				getMenorNota(), getMaiorNota());
		//chama os métodos getMenorNota e getMaiorNota
		
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
	//calcula a média de notas
	public double getMedia() {
		
		int total = 0;
		
		for(int nota : this.notas) {
			total += nota;
		}
		return (double) total / this.notas.length;
	}
	
	//gera a saída do gráfico de barras que exibe a distribuição de notas
	public void outPutGraficoBarras() {
		
		System.out.println("Distribuição de notas:");
		
		//armazena frequência de notas num intervalo de 10 notas
		int[] frequencia = new int[11];
		
		for(int nota : this.notas) { 
			++frequencia[nota / 10]; // para cada nota, incrementa a frequência apropriada
		}
		
		for(int i = 0; i < frequencia.length; i++) {
			//gera saída do título do intervalo de notas("00-09: ", ...)
			if(i == 10) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}
			//imprime barra de asterísco
		for(int estrela = 0; estrela < frequencia[i]; estrela++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
	}
	//gera saída do conteúdo do array de notas
	public void outPutNotas() {
		System.out.printf("As notas são:%n%n");
		
		//gera saída de nota de cada aluno
		for(int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d: %3d%n", 
					estudante + 1, notas[estudante]);
		}
	}
}
