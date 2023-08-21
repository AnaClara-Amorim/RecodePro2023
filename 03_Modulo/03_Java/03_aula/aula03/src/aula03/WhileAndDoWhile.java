package aula03;

import java.util.Scanner;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int valor = 10;
		//int i = 1;
		//while (i<=valor) {
		//	System.out.println(i);		
		//	i++;
		//}

		Scanner entrada = new Scanner(System.in);
		int valor = 10;
		
		do  {
			System.out.println ("Digite um valor");
			valor = entrada.nextInt();
			
		} while (valor!=0);
		
		System.out.print("Tecla zera pressionada!");
		
	}

}
