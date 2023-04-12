package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o código abaixo vai ser um Controller, ou um controlador da nossa api
@RestController

//indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		return "Alô mundão espero que dê certo!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "\nMentalidade de Crescimento \nPersistencia \nResponsabilidade Pessoal \nOrientação ao futuro \nComunicação \nOrientação ao detalhe \nProatividade \nTrabalho em equipe";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aperfeiçoar a mentalidade de crescimento e trabalho em equipe";
	}

	
}
