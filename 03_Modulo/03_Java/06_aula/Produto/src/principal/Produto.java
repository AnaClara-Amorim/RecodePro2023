package principal;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	
	// Métodos acessores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	// Métodos de função
	
	public double totalEstoque() {
		return quantidade * preco;
	}
	
	public void addProduto (int qtd) {
		quantidade += qtd;
	}
	
	public void removerProduto (int qtd) {
		quantidade -= qtd;
	}
	
}
