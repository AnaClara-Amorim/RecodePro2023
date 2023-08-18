package aula02;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		a = 5;
		b = 10;
		
		if (a < b) {
			System.out.print(a);
		} else {
			System.out.print(b);
		}

		// Ternário
		
		String valor = (a <b)? "Verdadeiro":"Falso";
		System.out.print(valor);
		
	}

}
