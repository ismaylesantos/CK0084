package aula11.exceptions;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemplosExceções {

	//Neste exemplo, o metodo pode lançar uma exceção do tipo NumberFormatException
	//que é do tipo nao verificada. Por esse motivo não precisa incluir a terminação "throws NumberFormatException"
	// e nem do try-catch
	public void metodoComExcecaodoTipoNaoVerificada(int a) {
		if (a<20) throw new NumberFormatException();
		System.out.println("a = "+ a);
	}
	
	//Aqui temos uma exceção do tipo FileNotFoundException que é do tipo
	// verificada, logo precisamos do try-catch ou do throws
	public void metodoComExceçãoVerificada () throws FileNotFoundException {
		//Exemplo de método que pode retornar uma Exceção durante execução
		BufferedReader reader = new BufferedReader(new FileReader("C://local//naoexiste"));
	}
	
	public void chamaMetodosComExceção() {
		
		//1 - bloco try-catch
		/*try {
			// Chamando um método que dispara uma exceção
			metodoComExceçãoVerificada();
		} catch (FileNotFoundException e) {		
			// Tratamento da Exceção
			System.out.println("Arquivo não encontrado");
		} */
		
		
		//2 - bloco try-catch-finally
		
		/*try {
			metodoComNullPointException();	
		}catch (NullPointerException e) {
			// Tratamento da Exceção
			System.out.println("Exceção foi tratada");
		} finally {
			System.out.println("Sempre é executado");
		}*/
		
		
		//3 - Exceção que não é capturada
		exemploComExceçãoNãoCapturada();
		
		//4 - Catch vazio
		//exemploComCatchVazio();
	}
	
	public void metodoQueNaoTrataExcecaoSoRepassa() throws NullPointerException{
		metodoComNullPointException();
	}
	
	
	public void metodoComNullPointException () {
		//Exemplo de método que pode retornar uma Exceção durante execução
		throw new NullPointerException("exceção disparada");		
	}
	
	public void exemploComCatchVazio() {
		
		//ERRADO - NÃO FAZER ISSO - catch bloco vazio
		try {
			//Código
		}catch (Exception e) {			
		}
		
		//Sugerido - tratar a exceção no bloco catch ou pelo menos registrar no log
		try {
			//Código
			throw new Exception();
		}catch (Exception e) {
			//Salvar no arquivo de Log a exceção			
			Logger logger = Logger.getAnonymousLogger();
			//logger.log(Level.SEVERE, "execeção grave");
			
			logger.log(Level.SEVERE, "execeção grave",e);			
		}
		
	}
	
	public void exemploComExceçãoNãoCapturada() {
		int[] vetor = new int[4];
		
		try {
			int i = vetor[4]; // vai disparar exceção
			
			System.out.println("Comandos dentro do bloco try");
		}catch (NullPointerException e) { // não vai capturar a exceção disparada na linha 96
			System.out.println("Exceção capturada");
		} 
		
		System.out.println("Resto do Programa");
	}
	
	public void metodoChamaMinhaExcecao(String nome) throws SemLetraBException {
		if(!nome.contains("b")) {
			throw new SemLetraBException();
		}else {
			System.out.println("Nome está de acordo");
		}
		
	}
	
}
