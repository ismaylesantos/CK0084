package aula06;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		//carro.ligar("b");
		
		//carro.calibrarFor(34);
		
		//carro.modelosDeCarroArray();
		
		int[][] alunos = new int[3][2];
		alunos[0][0] = 2;
		alunos[0][1] = 3;
		
		alunos[1][0] = 6; 
		alunos[1][1] = 8;
		
		alunos[2][0] = 5;
		alunos[2][1] = 6; 
		
		//começou com i = 0
		for (int i = 0; i < 3; i++) {
			int nota1 = alunos[i][0];
			int nota2 = alunos[i][1];
			float media = (nota1+nota2)/2;
			
			if(media >= 7) {
				System.out.println("Aluno "+(i+1)+" passou");
			}else {
				System.out.println("Aluno "+ (i+1)+" não passou");
			}
		}// i = i + 1
	}
}
