package aula02;
import java.util.Scanner;

public class ExercicioEmSquad {	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		double precoDias = 0;
		double precoKm = 0;
		double kmAMais = 0;
		double totKm = 0;
		double total = 0;		

		System.out.println("Qual o tipo de carro que vc escolheu? \n 1 - Carro Popular \n 2 - Carro de Luxo");
		int tipoCarro = SC.nextInt();

		System.out.print("Qual a quantidade de quilômetros rodadas: ");
		double qddKm = SC.nextDouble();	

		System.out.print("Quantos dias você ficou com o carro?");
		int qddDias = SC.nextInt();		

		if (tipoCarro == 1) {
			precoDias = qddDias*90;
			if (qddKm <= 100) {
				precoKm = qddKm*0.20;	
			}else {
				kmAMais = qddKm - 100;
				precoKm = (100*0.20) + (kmAMais*0.30);	
			}		

		}else if(tipoCarro == 2){
				precoDias = qddDias*150;		
			if (qddKm <= 200) {
				precoKm = qddKm*0.30;
			}else {
				kmAMais = qddKm - 200;
				precoKm = (200*0.30) + (kmAMais*0.25);
			}		

		}else {
			System.out.println("TIPO DE CARRO INVÁLIDO.");
		}		

		total = precoDias + precoKm;		

		System.out.printf("O preço a ser pago é de: R$ %.2f", total);		

	}

}

//Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. 
//O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. 
//Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com tabela a seguir:
//- Carros populares (aluguel de R$90 por dia)
//- Até 100Km percorridos: R$0,20 por Km - Acima de 100Km percorridos: R$0, 10 por Km
//Carros de luxo (aluguel de R$150 por dia) Até 200Km percorridos: R$0,30 por Km Acima de 200Km percorridos: R$0,25 por Km.