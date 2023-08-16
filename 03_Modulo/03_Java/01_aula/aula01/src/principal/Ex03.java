package principal;

public class Ex03 {

	public static void main(String[] args) {
		
		double presTotal = 24;

		double presPagas = 13;

		double presValor = 1235.45;

		double totalPago = presPagas*presValor;

		double saldo = (presTotal*presValor) - totalPago;

		System.out.printf("O total pago foi R$: %.2f e o saldo devedor é R$: %.2f", totalPago, saldo);

	}

}
