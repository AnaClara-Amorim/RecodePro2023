package principal;

public class Ex01 {

	public static void main(String[] args) {
		// O custo de um carro novo ao consumidor é a soma do custo de fábrica
		// com a porcentagem do distribuidor e dos impostos (aplicados ao custo
		//de fábrica). Supondo que o percentual do distribuidor seja de 28% e os 
		// impostos de 45%, escrever um código para processar e mostrar o custo
		//final ao consumidor
		
		double custoFabrica = 10.000;
		double precoDistribuidor = 0.28;
		double impostos = 0.45;
		double carroNovo = custoFabrica +  precoDistribuidor + impostos;
		System.out.println("O custo final ao consumidor é de R$: " + carroNovo);
		
		
	}

}
