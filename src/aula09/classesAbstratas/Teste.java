package aula09.classesAbstratas;



public class Teste {

	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setSaldo(100);
		poupanca.imprimeExtrato();
		
		double resposta = poupanca.getSaldo();
		System.out.println(resposta);
		
		ContaCorrente corrente = new ContaCorrente();
		System.out.println("Saldo conta corrente "+corrente.getSaldo()+ " - Foi esse!");
		
		//Usando métodos com sobrecarga
		
		ContaPoupanca poupanca1 = new ContaPoupanca();
		ContaPoupanca poupanca2 = new ContaPoupanca(4.5);
				
	}
}
