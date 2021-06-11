package aula08.heranca;

public class Humano {
	double peso;
	
	public Humano(double peso) {
		this.peso = peso;
	}
	
	public void printPeso() {
		System.out.println("Imprimindo Peso "+ peso);
	}
	
	
	public String toString() {
		return "O Peso é "+peso;
	}
	
	public void setPeso(double novoPeso) {
		peso = novoPeso;		
	}
}
