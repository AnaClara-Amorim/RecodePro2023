package principal;

public class Main {

	public static void main(String[] args) {
		
		Produto feijao = new Produto();
		Produto arroz = new Produto();
		Produto macarrao = new Produto();
		
		feijao.nome = "Carioca";
		feijao.preco = 12;
		feijao.quantidade = 30;
		
		feijao.adicionarProduto(50);
		feijao.remover(79);
			
		System.out.println(feijao.quantidade);
		
		System.out.print("Total em estoque: " + feijao.total() );
		
		Carro fusca = new Carro();
		fusca.nome = "Fusquinha";
		fusca.modelo = "fuscaue";
		fusca.ano = 1900;
		
		System.out.println (fusca.nome);
		System.out.println (fusca.andar());
		
	}

}
