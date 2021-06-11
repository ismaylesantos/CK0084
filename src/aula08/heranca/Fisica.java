package aula08.heranca;

public class Fisica extends Pessoa {
	private String cpf;
		
	public String getCpf() {		
		return cpf;		
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimirDocumentos() {
		System.out.println("RG: " +super.getRg());
		System.out.println("CPf: " +getCpf());
	}
	
	public int getRg() {
		System.out.println("Não tenho RG");
		return 0;
	}
}
