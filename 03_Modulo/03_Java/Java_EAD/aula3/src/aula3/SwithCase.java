package aula3;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Qual ano o Brasil foi tetra campeão? ");
		int num = dados.nextInt();		
		dados.close();
		
		switch (num) {
		
		case 1985:
			System.out.println("Você errou, tente novamente!");
		break;
		case 1994:
			System.out.println("Você acertou!");
		break;
		default:
			System.out.println("Número inválido");
		break;		
		}

	}

}
