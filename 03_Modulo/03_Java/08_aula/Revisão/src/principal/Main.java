package principal;

 

import java.util.Date;

import java.util.Scanner;
ç-.p
public class Main {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		Medico medico = new Medico();

		Paciente paciente =  new Paciente();


		System.out.println("Entre com os dados do medico: ");

		

		System.out.println("Entre com o nome do medico: ");

		String nome = entrada.next();		

		medico.setNome(nome);


		System.out.println("Entre com o crm do medico: ");

		String crm = entrada.next();		

		medico.setCrm(crm);


		System.out.println("Entre com o endereço do medico: ");

		String endereco = entrada.next();		

		medico.setEndereco(endereco);

		

		

		System.out.println("Entre com os dados do Paciente: ");

		

		System.out.println("Entre com o id do paciente: ");

		int id = entrada.nextInt();

		paciente.setId(id);

		

		System.out.println("Entre com o nome do paciente: ");

		String nome2 = entrada.next();		

		paciente.setNome(nome2);

		

		System.out.println("Entre com o endereco do paciente: ");

		String endereco2 = entrada.next();		

		paciente.setEndereco(endereco2);
		

		System.out.println("Entre com o sexo do paciente: ");

		String sexo = entrada.next();

		paciente.setSexo(sexo);

		paciente.setDate(new Date());	

		

		Consulta consulta =  new Consulta(001, new Date(), medico, paciente);


		System.out.println(" ===== Dados da Consulta ==== ");

		System.out.println("Data: " + consulta.getData());

		System.out.println("Codigo: " + consulta.getId());

		System.out.println("Nome Medico: " + consulta.getMedico().getNome());

		System.out.println("Nome do Paciente: " + consulta.getPaciente().getNome());		

	

	}

 

}