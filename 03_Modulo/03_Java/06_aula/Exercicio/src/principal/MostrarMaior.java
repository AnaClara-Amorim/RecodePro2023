package principal;

//Criar uma classe com um atributo private chamado maior, gerar os
//metodos get e set para o atributo..criar um metodo que receba dois numeros como
//parametro e retorne o maior entre eles direto no atributo maior. Criar um segundo metodo do tipo void só para motrar o maior valor.

public class MostrarMaior {
	private double maior;

	public double getMaior() {
		return maior;
	}

	public void setMaior(double maior) {
		this.maior = maior;
	}
	
	public void acharMaior (double v1, double v2) {
		if (v1 > v2) {
			maior = v1;
		} else {
			maior = v2;
		}
	}
	
	void mostrarMaior() {
		System.out.print("O maior valor é: " + maior);
	}
	
}
