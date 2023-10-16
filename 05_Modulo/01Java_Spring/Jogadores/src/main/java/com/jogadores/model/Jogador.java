package com.jogadores.model;

public class Jogador {

	private int numero;
	private String nome;
	
	public Jogador(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}
	
	public Jogador(){}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
