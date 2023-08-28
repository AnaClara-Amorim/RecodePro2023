package principal;

public class Principal {

	public static void main(String[] args) {
		
		Caixa caixa1 = new Caixa();
		
		caixa1.setSaldo(1000);
		
		System.out.print(caixa1.getSaldo());
		
		caixa1.extrato();
		
		caixa1.depositar(1000);
		
		caixa1.extrato();
	
	}

}
