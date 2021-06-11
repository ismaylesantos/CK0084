package aula09.classesAbstratas;

//Classe abstrata precisa da palavra reservada "abstract"
public abstract class Conta {
		private double saldo;

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getSaldo() {
			return saldo;
		}

		//exemplo de método abstrato
		public abstract void imprimeExtrato();
	
}
