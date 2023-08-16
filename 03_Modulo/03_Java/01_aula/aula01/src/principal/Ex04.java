package principal;
import java.util.Scanner; //Importando o scanner para entradas

public class Ex04 { 

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		

		int numero, horas;
		double valorHora, salario;

		System.out.print("Digite o numero do funcionario: ");
		numero = entrada.nextInt();
		

		System.out.print("Digite o numero de horas trabalhadas: ");
        horas = entrada.nextInt();        

        System.out.print("Digite o valor por hora trabalhada:");
        valorHora = entrada.nextDouble(); 

       salario = valorHora * horas;           

       System.out.println("FUNCIONARIO DE NUMERO:" + numero);
       System.out.printf("SALÁRIO = R$ %.2f%n", salario);     

       entrada.close();
	}
}