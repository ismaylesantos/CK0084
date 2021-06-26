package tp3;

//Resposta do item 2) do TP-3
public abstract class Quadrilatero implements Forma{

	protected double ladoA;
	protected double ladoB;
	protected double ladoC;
	protected double ladoD;	
	
	public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD ) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}
	
	public double getPerimetro() {
		return ladoA+ladoB+ladoC+ladoD;
	}
}
