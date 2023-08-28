package principal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod1 = new Produto();
		
		prod1.setNome("Feijão");;
		prod1.setPreco(10);
		prod1.addProduto(1000);
		
		System.out.println("Produto: " + prod1.getNome());
		System.out.println("Preço: " + prod1.getPreco());
		System.out.println("Quantidade em estoque: " + prod1.getQuantidade());
		
		
	}

}
