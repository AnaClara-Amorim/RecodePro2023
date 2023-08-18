package aula02;
import java.util.Scanner;

public class Exercícios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("===Simulador de faturas===");
		System.out.println("Informe quantiidade de minutos utilizada: ");
			int minutos = entrada.nextInt();

			int minexcedente = 0;
			double valorFinal = (double) 50 ;

		if (minutos > 100) {
				minexcedente = (minutos - 100) * 2;
		}
			valorFinal += minexcedente;
		System.out.printf("Você utilizou %d minutos.\nSua fatura custará: R$%.2f", minutos, valorFinal);

	}
}
