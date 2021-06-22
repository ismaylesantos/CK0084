package aula11.exceptions;

import java.io.FileNotFoundException;

public class Main {
	
	
	public static void main(String[] args) {
		ExemplosExce��es exemplos = new ExemplosExce��es();
		
		//#1 Exemplo de exce��o n�o verificada
		//exemplos.metodoComExcecaodoTipoNaoVerificada(20);
		//Vai lan�ar Exce��o
		//--- exemplos.metodoComExcecaodoTipoNaoVerificada(6);
		
		//#2 Exemplo de exce��o verificada
		/*try {
			exemplos.metodoComExce��oVerificada();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exce��o disparada!!");
			e.printStackTrace();
		}*/
		
		//#3 Exemplos de throws, try-catch e try-catch-finally
		//exemplos.chamaMetodosComExce��o();
		
		//#4 Exemplo de Pilha Exce��o. Note que a exce��o vem do m�todo: metodoComNullPointException
		/*try {
			exemplos.metodoQueNaoTrataExcecaoSoRepassa();
		}catch (NullPointerException e) {
			System.out.println("Exce��o NUllPointException Capturada");
		}*/
		
		//#5 metodoChamaMinhaExcecao
		/*try {
			exemplos.metodoChamaMinhaExcecao("casa");
		} catch (SemLetraBException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		//#6 - Exemplo de Verifica��o de Entradas  
		//Esse m�todo que n�o verifica a entrada de forma adequada
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
	
	//Exemplo de m�todo com valida��o INEFICIENTE da entrada
	public static int fatorial(int num) {		
		if(num == 0)
			return 1;
		else
				return num * fatorial(num-1);
	}	

}
