package tp3;

public class Teste {

	public static void main(String[] args) {
		
		//Na classe principal (com o main), você deve instanciar um quadrado, 
		//um retângulo e um círculo, e deve  imprimir: (a) os dados 
		//(lados ou raio); (b) os perímetros; e (c) as áreas de todas 
		//as formas
		Quadrado quadrado = new Quadrado(4);
		Retangulo retangulo = new Retangulo(2, 4);
		Circulo circulo = new Circulo();
		
		//(a)
		quadrado.printLado();
		retangulo.printLados();
		circulo.printRaio();
		
		//(b)
		System.out.println("--- Perímetros ---");
		System.out.println(quadrado.getPerimetro());
		System.out.println(retangulo.getPerimetro());
		System.out.println(circulo.getPerimetro());
		
		//(c)
		System.out.println("--- Área ---");
		System.out.println(quadrado.getArea());
		System.out.println(retangulo.getArea());
		System.out.println(circulo.getArea());
		
	}
}
