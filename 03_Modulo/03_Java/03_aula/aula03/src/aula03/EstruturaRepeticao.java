package aula03;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int i;
		
		System.out.println("Tabuada de: ");
		int valor = entrada.nextInt();

		for (i=1; i<=10; i++){
		System.out.println(valor + " X " + i + " = " + (valor * i));
		}
		
	}

}
