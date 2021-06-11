package aula08.heranca;


public class Pessoa extends Humano{
	private String nome;
	private int rg;

	public Pessoa() {
		super(3); // acessa o construtor da superclasse		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		System.out.println("Método da SuperClasse");
		this.rg = rg;
	}
}
