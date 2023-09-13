package principal;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		/*Contato contato = new Contato();
		
		contato.setNome("Gabriel");
		contato.setIdade(25);
		contato.setDataCadastro(new Date());
		
		contatoDAO.save(contato);*/
		
		//contatoDAO.removeById(1);
		
		for (Contato c : contatoDAO.getContatos()) {	 
			System.out.println("NOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("DATA CADASTRO: " + c.getDataCadastro());
			System.out.println("----------------------------------- ");
		}	
		

	}

}

