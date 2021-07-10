package tp3;

//Resposta do item 3) do TP-3
public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		super(lado, lado, lado, lado); 
	}	
	
	@Override
	public double getArea() {		
		return ladoA*ladoB;
	}
	
	public void printLado() {
		System.out.println("lado do Quadrado: "+ladoA);
	}

}
