package principal;

public class Produto {

	// Atributos que só podem ser usados dentro dessa classe
	String nome;
	double preco;
	int quantidade;
	
	// Métodos 
	
	//Sem retorno
	void adicionarProduto(int qtd) {
		//quantidade = quantidade + qtd;
		quantidade += qtd;
	}
	
	//Com retorno
	
	double total() {
		return preco * quantidade;
	}
	
	double remover(int qtd) {
		return quantidade -= qtd;
	}
}
