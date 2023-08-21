package aula03;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				String nome, senha, tipo;	 

				nome = "Flavio";
				senha = "123";
				tipo = "adm";


				String nomeComparacao = "Flavio";
				String senhaComparacao = "123";
				String tipoComparacao = "adm";		 

				if ((nome.equals(nomeComparacao)) && (senha.equals(senhaComparacao))){
		 

					if (tipo.equals(tipoComparacao)) {

						System.out.print("Entrou com adm");		 
					} else {

						System.out.print("Entrou com usuario comum");
						} 

				}else {
					System.out.print("Dados invalidos");

				} 
			}	 
		}