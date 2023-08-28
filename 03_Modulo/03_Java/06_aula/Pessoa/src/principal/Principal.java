package principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		String nome = entrada.next();		
		
		pessoa1.setNome(nome);
		
		System.out.print(pessoa1.getNome());
	}

}
