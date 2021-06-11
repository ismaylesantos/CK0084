package aula08.heranca;

public class Test {
	public static void main(String[] args) {
		Pessoa marcelo = new Pessoa();
		marcelo.setNome("Marcelo");
		
		Fisica pessoaFisica = new Fisica();
		pessoaFisica.setCpf("12345");
		// Esse método veio da superclasse Pessoa
		pessoaFisica.setNome("Alex");
						
		Juridica pessoaJuridica = new Juridica();
		pessoaJuridica.setCnpj("12345-1000");
		// Esse método veio da superclasse Pessoa
		pessoaJuridica.setNome("João");
		
		System.out.println("Nome Pessoa Física: "+pessoaFisica.getNome());
		System.out.println("Nome Pessoa Jurídica: "+pessoaJuridica.getNome());
		
		// Esse método veio da superclasse da superclasse
		pessoaFisica.setPeso(4.5); 
		// por padrão "." é separador decimal e reconhecido como double.
		// para ser float tem que colocar 3.4f
		pessoaFisica.printPeso();
		
				
		//Sobrecarga de método
		System.out.println(marcelo.toString());
		
		//Métodos que usaram a palavra reservada Super
		pessoaFisica.setRg(456);
		pessoaFisica.imprimirDocumentos();
	}

}
