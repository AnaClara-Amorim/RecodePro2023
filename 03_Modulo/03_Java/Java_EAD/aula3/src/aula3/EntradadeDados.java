package aula3;
import java.util.Scanner;

public class EntradadeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = dados.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = dados.nextFloat();		
		dados.close();
		
		float imc = peso/(altura*altura);
		System.out.println("Seu imc é: " + imc);
		
		if (imc < 16) {
			System.out.println("O seu peso é de " + imc + ", considerado com Magreza Grave");			
		}
		else if(imc >= 16.1 && imc >= 17){
			System.out.println("O seu peso é de " + imc + ", considerado com Magreza moderada"); 		
		}
		else if (imc >= 117.1 && imc < 18.5) {
			System.out.println("O seu peso é de " + imc + ", considerado com Magreza leve");
		}
	}

}
