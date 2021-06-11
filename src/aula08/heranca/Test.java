package aula08.heranca;

public class Test {
	public static void main(String[] args) {
		Pessoa marcelo = new Pessoa();
		marcelo.setNome("Marcelo");
		
		Fisica pessoaFisica = new Fisica();
		pessoaFisica.setCpf("12345");
		// Esse m�todo veio da superclasse Pessoa
		pessoaFisica.setNome("Alex");
						
		Juridica pessoaJuridica = new Juridica();
		pessoaJuridica.setCnpj("12345-1000");
		// Esse m�todo veio da superclasse Pessoa
		pessoaJuridica.setNome("Jo�o");
		
		System.out.println("Nome Pessoa F�sica: "+pessoaFisica.getNome());
		System.out.println("Nome Pessoa Jur�dica: "+pessoaJuridica.getNome());
		
		// Esse m�todo veio da superclasse da superclasse
		pessoaFisica.setPeso(4.5); 
		// por padr�o "." � separador decimal e reconhecido como double.
		// para ser float tem que colocar 3.4f
		pessoaFisica.printPeso();
		
				
		//Sobrecarga de m�todo
		System.out.println(marcelo.toString());
		
		//M�todos que usaram a palavra reservada Super
		pessoaFisica.setRg(456);
		pessoaFisica.imprimirDocumentos();
	}

}
