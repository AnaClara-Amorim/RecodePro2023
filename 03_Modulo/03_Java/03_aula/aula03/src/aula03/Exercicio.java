package aula03;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int valor=0, i, fora = 0, dentro = 0;
		
		for (i=1; i <=10; i++) {
			System.out.print("Digite o " + i + " valor");
			valor = entrada.nextInt();
			
			if (valor >= 10 && valor <= 20) {
				dentro++;
			} else {
				fora++;
			}			
			
		}
		System.out.print("Quantidade dentro do intervalo: " + dentro);
		System.out.print("Quantidade fora do intervalo: " + fora);
		entrada.close();
	}
	
}
