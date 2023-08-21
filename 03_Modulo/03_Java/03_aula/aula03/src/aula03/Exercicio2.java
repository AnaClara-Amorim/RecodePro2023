package aula03;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simular uma compra de n produtos ao final
		// mostrar o total do compra e o imposto de 18% sobre a compra
		
		Scanner entrada = new Scanner(System.in);
				
		double valorProduto, totalCompra = 0, imposto;
		int totalProduto = 0;
				
		System.out.println("Digite o total de produtos: ");
		totalProduto = entrada.nextInt();
		
		for (int i = 1; i <= totalProduto; i++) {
			
			valorProduto = entrada.nextDouble();
			totalCompra += valorProduto;					
		}
		
		imposto = totalCompra * 0.18;
		
		System.out.print("Total da compra igual = " + totalCompra);
		System.out.print("Imposto sobre a compra = " + imposto);

	}

}
