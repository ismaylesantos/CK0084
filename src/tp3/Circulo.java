package tp3;

//Resposta do item 4) do TP-3
public class Circulo implements Forma{

	private int raio;
	
	public Circulo() {
		raio = 1;
	}
	
	public Circulo(int raio) {
		this.raio = raio;
	}

	public double getArea() {
		// Estou usando o método pow da classe Math para "raio elevado a 2"		
		return 3.14 * Math.pow(raio,2);
	}

	@Override
	public double getPerimetro() {
		// 3.14 é o valor de PI
		return 2 * 3.14 * raio;
	}
	
	public void printRaio() {
		System.out.println("Raio: "+raio);
	}
}
