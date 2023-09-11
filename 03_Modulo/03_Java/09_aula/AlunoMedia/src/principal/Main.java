package principal;

public class Main {

	public static void main(String[] args) {
		// Construção dos objetos
		
		Aluno x = new Aluno("001", "Aluno1", 8, 6, 9);
		
		double media = x.media();		
		
		x.resultado(media);

	}
}
