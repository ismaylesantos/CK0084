package aula29.io;

import java.io.File;
import java.io.IOException;

public class TestArquivos {

	public static void main(String[] args) {
		// Diret�rio original: C:\Users\ismaylesantos\Desktop\arquivo1.txt
		// Notem que mudei as barras
		File arquivo = new File ("C:\\Users\\ismaylesantos\\Desktop\\arquivo1.txt");
		System.out.println("Arquivo encontrado? " + arquivo.exists());
		
		//Exemplo criando diret�rio e arquivo. Pr�-condi��o: n�o existe arquivo2
		File arquivoTxtCriado = new File ("C:\\Users\\ismaylesantos\\Desktop\\NovoArquivo\\arquivo2.txt");
		File diretorio = new File ("C:\\Users\\ismaylesantos\\Desktop\\NovoArquivo");

		
		//CRIAR
		
		//o comando para criar diret�rio retorna true ou false
		/*boolean resposta = diretorio.mkdir();
		System.out.println("Diret�rio Criado? " + resposta);
		
		try {
			arquivo2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exce��o Disparada");
			e.printStackTrace();
		}
		*/
		
		//DELETAR
		//arquivoTxtCriado.delete();
		
		//OPERA��ES - agora usando os m�todos da classe criada FileUtils
		//Escrever
		FileUtils utilidades = new FileUtils();
		
		/*
		try {
			utilidades.EscreveNoArquivoSemApagar(arquivo, "Ol� Mundo");
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
