package principal;

public class Caixa {

		private double saldo = 1000; // Private impede acesso à variável
		
		public void setSaldo(double value) {
			saldo += value;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		void depositar(double valor) {
			saldo += valor;
		}
		
		void sacar (double valor) {
			saldo -= valor;
		}
		
		void extrato () {
			System.out.println("Saldo atual: " + saldo);
		}
}
