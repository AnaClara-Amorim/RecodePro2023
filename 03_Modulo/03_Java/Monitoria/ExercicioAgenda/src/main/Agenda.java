package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu: ");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Excluir contato");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Pesquisa por nome");
            System.out.println("5 - Encerrar");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            switch(opcao) {
                case 1:
                    System.out.println("Nome do contato: ");
                    String nome = sc.nextLine();
                    System.out.println("Telefone do contato: ");
                    String telefone = sc.nextLine();
                    nomes.add(nome);
                    telefones.add(telefone);
                    System.out.println("Contato adicionado.");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato pra ser excluído: ");
                    String nomeExcluir = sc.nextLine();
                    int indice = nomes.indexOf(nomeExcluir);
                    if (indice != -1) {
                        nomes.remove(indice);
                        telefones.remove(indice);
                        System.out.println("Excluido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contatos: ");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("Nome: " + nomes.get(i) +
                                "Telefone: " + telefones.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome a ser buscado: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Contato encontrado! Nome: " + nomes.get(i) +
                                    ", Telefone: " + telefones.get(i));
                            encontrado = true;
                        }
                    }
                    if (!encontrado)
                        System.out.println("Contato não encontrado.");
                    break;
                case 5:
                    System.out.println("Encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        sc.close();
    }
}