package aula29.io;

import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) {
		//Entrada
		/*Scanner teclado = new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		//Saída
		System.out.println("Obrigado por informar que você tem "+ idade +" anos");
		System.out.println("Digite seu nome: ");
		
		teclado = new Scanner (System.in);
		String nome = teclado.nextLine();
		
		System.out.println("Olá "+ nome);
		*/
		
		// Saída formatada
		System.out.printf("Usando string formatada com inteiro %d, string %s"
				+ " caractere %c e float com 2 casas decimais %.2f", 3,"oi",'c',4f);
		
		System.out.print("\n Imprimindo \n um em cada \n linha");
		
	}
}
