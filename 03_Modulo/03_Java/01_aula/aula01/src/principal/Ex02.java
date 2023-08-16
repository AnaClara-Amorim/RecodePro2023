package principal;

public class Ex02 {

	public static void main(String[] args) {
		// Código que seja atribuído aa uma variável o nome de um piloto,
		// uma distancia percorrida em km e o tempo queo piloto levou (em horas).
		// O programa deve calcular a velocidade média em km/h, e exibir
		// A velocidade média de xx foi de yy km/h, onde o nome do piloto e yy 
		// é sua velocidade média
		
		String nomePiloto = "Piloto1";
		double distanciaPercorrida = 100;
		double tempo = 2;
		double velocidadeMedia = distanciaPercorrida/tempo;
		
		System.out.println("A velocidade média foi de " + velocidadeMedia + "km/h Onde o nome do piloto é: " + nomePiloto);

	}

}
