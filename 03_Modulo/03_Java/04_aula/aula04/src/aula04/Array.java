package aula04;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite o valor: " + (i + 1));
			notas[i] = entrada.nextDouble();
		}

	}

}
