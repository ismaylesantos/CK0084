package aula09.interfaces;

public class Test {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.marca = Marcas.Gol;
		
		Caminhao caminhao = new Caminhao();
				
		
		System.out.println(carro.pequeno);
		System.out.println(carro.id);
		
		// vai dar erro porque não é possível alterar o valor de uma constante
		//carro.pequeno = false;  
		//carro.id = 4; 
		
	}
}
