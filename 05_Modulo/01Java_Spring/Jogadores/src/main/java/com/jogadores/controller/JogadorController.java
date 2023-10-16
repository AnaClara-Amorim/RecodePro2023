package com.jogadores.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jogadores.model.Jogador;

@Controller

public class JogadorController {

	
	List<Jogador> jogadores = new ArrayList <> ();
	
	// Criando rota
	
	@GetMapping("/")
	public String listaJogadores(Model model) {
		
		jogadores.add(new Jogador(1, "Jogador 01"));
		jogadores.add(new Jogador(2, "Jogador 02"));
		jogadores.add(new Jogador(3, "Jogador 03"));
		
		model.addAttribute("jogadores", jogadores);
		
		return "ViewJogadores";
	}
}
