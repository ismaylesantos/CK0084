package aula11.exceptions;

import java.io.FileNotFoundException;

public class Main {
	
	
	public static void main(String[] args) {
		ExemplosExceções exemplos = new ExemplosExceções();
		
		//#1 Exemplo de exceção não verificada
		//exemplos.metodoComExcecaodoTipoNaoVerificada(20);
		//Vai lançar Exceção
		//--- exemplos.metodoComExcecaodoTipoNaoVerificada(6);
		
		//#2 Exemplo de exceção verificada
		/*try {
			exemplos.metodoComExceçãoVerificada();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exceção disparada!!");
			e.printStackTrace();
		}*/
		
		//#3 Exemplos de throws, try-catch e try-catch-finally
		//exemplos.chamaMetodosComExceção();
		
		//#4 Exemplo de Pilha Exceção. Note que a exceção vem do método: metodoComNullPointException
		/*try {
			exemplos.metodoQueNaoTrataExcecaoSoRepassa();
		}catch (NullPointerException e) {
			System.out.println("Exceção NUllPointException Capturada");
		}*/
		
		//#5 metodoChamaMinhaExcecao
		/*try {
			exemplos.metodoChamaMinhaExcecao("casa");
		} catch (SemLetraBException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		//#6 - Exemplo de Verificação de Entradas  
		//Esse método que não verifica a entrada de forma adequada
		//fatorial(5);
		
		exemplos.doismetodosFor();
		/*try {
			exemplos.lancaDeNovo();
		} catch (SemLetraBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			exemplos.metodoChamaMinhaExcecao("b");
		} catch (SemLetraBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
	}
	
	//Exemplo de método com validação INEFICIENTE da entrada
	public static int fatorial(int num) {		
		if(num == 0)
			return 1;
		else
				return num * fatorial(num-1);
	}	

}
