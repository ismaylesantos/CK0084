package tp3;

//Resposta do item 3) do TP-3
public class Retangulo extends Quadrilatero {
	
	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
	}

	@Override
	//Aqui eu estou aproveitando os atributos da superclasse
	//Note que no construtor eu já defini ladoA = o valor base e ladoB = altura 
	public double getArea() {
		return ladoA * ladoB;
	}
	
	public void printLados() {
		System.out.println("Base do Retângulo: "+ladoA);
		System.out.println("Altura do Retângulo: "+ladoB);
	}
}
