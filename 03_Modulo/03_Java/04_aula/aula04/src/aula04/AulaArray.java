package aula04;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		ArrayList<String> dados = new ArrayList<>();
		dados.add("Flavio");
		dados.add("Raquel");
		dados.add("Rochele");
		dados.add("Antonia");
		dados.add("Joao"); 

		for (String dado : dados) {
			System.out.println("Nome: " + dado);
		}
		// dados.remove("Raquel");			

		System.out.println("Adicionar mais um valor ao array: ");
		String nome;

		nome = entrada.next();

		System.out.println("Esolha a posição do array: ");
		int posicao;

		posicao = entrada.nextInt();		

		dados.add(posicao,nome);

		for (int i = 0; i < dados.size(); i++) {
			System.out.println("Nome : " + dados.indexOf("Flavio"));
		}	 

	}
}