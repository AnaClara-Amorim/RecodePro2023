package aula02;
import java.util.Scanner;

public class Exercícios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos utilizada: ");
		double minutosUtilizados = entrada.nextDouble();
		
		if (minutosUtilizados <= 100) {
			System.out.println("O preço a se pagar é de R$ 50!");			
		} else {
			double valorExcedente;
			double valorFinal;
			valorExcedente = minutosUtilizados - 100;
			valorFinal = valorExcedente * 2 + 50;
			System.out.println("O preço a se pagar é de R$: " + valorFinal);			
			
		}
		
	}

}
