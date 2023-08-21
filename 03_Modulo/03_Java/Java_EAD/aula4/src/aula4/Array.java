package aula4;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [] stack = {"Java", "PHP", "JS", "Python"};
		//System.out.println(stack[3]);
		
		Scanner sc = new Scanner(system.in);
		
		int TAM = 5; 
		String[] nome = new String[TAM];
		double[] salario = new double[TAM];
		double reajuste; 
		
		for (int x = 0; x < TAM; x++) {
			System.out.println("Nome do" + x + "º funcionário: ");
			nome[x] = sc.next();
			System.out.println("Salário: R$");
			salario[x] = sc.next();			
		}
		System.out.println("== Informe o valor do reajuste (%): ==");
		reajuste = sc.nextDouble();
		System.out.println("Informaçãoes atualizadas: ");
		for (int x = 0; x < TAM; x++);{
			System.out.println("Nome" + nome[x] + " Salário: " + (salario[x] += (reajuste*salario[x] /100)));
			sc.close();
		}

	}

}
