package aula09.classesAbstratas;

public class ContaPoupanca extends Conta{
	String idConta;
	
	//Exemplo 1 de sobrecarga de m�todo
	public ContaPoupanca() {
		super.setSaldo(0);
	}
	
	public ContaPoupanca(double saldoInicial) {
		super.setSaldo(saldoInicial);
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("Implementa��o do m�todo abstrato ");
		System.out.println("Saldo: " +super.getSaldo());
	}
	
	//Exemplo de sobrescrita de m�todo (Polimorfismo Din�mico)
	@Override
	public double getSaldo() {
		return 50;
	}
	
	//Exemplo2 - sobrecarga de m�todo (Polimorfismo Est�tico)
	public void setBanco(String nomeBanco) {
		idConta = nomeBanco;
	}

	public void setBanco(String nomeBanco, int categoria) {
		idConta = nomeBanco+Integer.toString(categoria);
	}
}
