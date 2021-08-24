package aula29.io;

import java.io.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileUtils {

	public void criarArquivo (File file) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Exceção Disparada");
			e.printStackTrace();
		}
	}
	
	public void criarDiretorio(File file) {
		file.mkdir();
	}
	
	public void deletarArquivo (File file) {
		file.delete();
	}
	
	public void EscreveNoArquivo(File file, String texto) throws IOException {
		FileWriter fw = new FileWriter (file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//escrevendo o texto no arquivo
		bw.write(texto);
		
		// Adicionando uma linha no arquivo
		bw.newLine(); 
		
		//Informando ao SO que o arquivo não está mais sendo usado
		bw.close();
		fw.close();
	}
	
	public void EscreveNoArquivoSemApagar(File file, String texto) throws IOException {
		FileWriter fw = new FileWriter (file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//escrevendo o texto no arquivo
		bw.write(texto);
		
		// Adicionando uma linha no arquivo
		bw.newLine(); 
		
		//Informando ao SO que o arquivo não está mais sendo usado
		bw.close();
		fw.close();
	}
	
	public void LeArquivo (File file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		
		//Lendo as linhas do arquivo
		while (br.ready()) {
			System.out.println(br.readLine());
		}
		
		//Informando ao SO que o arquivo não está mais sendo usado
		br.close();
		br.close();
	}
}
