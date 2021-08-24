package aula29.io;

import java.io.File;
import java.io.IOException;

public class TestArquivos {

	public static void main(String[] args) {
		// Diretório original: C:\Users\ismaylesantos\Desktop\arquivo1.txt
		// Notem que mudei as barras
		File arquivo = new File ("C:\\Users\\ismaylesantos\\Desktop\\arquivo1.txt");
		System.out.println("Arquivo encontrado? " + arquivo.exists());
		
		//Exemplo criando diretório e arquivo. Pré-condição: não existe arquivo2
		File arquivoTxtCriado = new File ("C:\\Users\\ismaylesantos\\Desktop\\NovoArquivo\\arquivo2.txt");
		File diretorio = new File ("C:\\Users\\ismaylesantos\\Desktop\\NovoArquivo");

		
		//CRIAR
		
		//o comando para criar diretório retorna true ou false
		/*boolean resposta = diretorio.mkdir();
		System.out.println("Diretório Criado? " + resposta);
		
		try {
			arquivo2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exceção Disparada");
			e.printStackTrace();
		}
		*/
		
		//DELETAR
		//arquivoTxtCriado.delete();
		
		//OPERAÇÕES - agora usando os métodos da classe criada FileUtils
		//Escrever
		FileUtils utilidades = new FileUtils();
		
		/*
		try {
			utilidades.EscreveNoArquivoSemApagar(arquivo, "Olá Mundo");
			utilidades.EscreveNoArquivoSemApagar(arquivo, "Novo Texto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um problema na escrita do arquivo");
		}
		*/
		//Ler
		
		try {
			utilidades.LeArquivo(arquivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um problema na leitura do arquivo");
		}
		
		
	}
}
