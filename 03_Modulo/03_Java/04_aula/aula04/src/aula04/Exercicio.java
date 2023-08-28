package aula04;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		// Tipagem 
		double[] salario = new double [5];
		String[] funcionario = new String[5];
		
		
		// Usando o mesmo for para leitura
		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva o nome do funcionário: ");
			funcionario[i] = entrada.next();
			
			System.out.print("Escreva o nome do salário: ");
			salario[i] = entrada.nextDouble();
			
		}
		// Lendo e calculando reajuste
		double reajuste = 0;
		System.out.print("Digite o valor do reajuste: ");
		reajuste = entrada.nextDouble();
		
		for (int i = 0; i < 5; i++) {
			salario[i] = (salario[i] / 100 * reajuste) + salario[i];
			
		}
		
		System.out.print("Salários atualizados: ");		
		for (int i = 0; i < 5; i++) {
			System.out.print("Nome do funcionário: " + funcionario[i]);
				
			System.out.print("Salário do funcionário: " + salario[i]);
						
		}

	}

}
