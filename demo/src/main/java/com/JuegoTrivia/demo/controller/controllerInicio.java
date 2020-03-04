package com.JuegoTrivia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerInicio {

	@GetMapping("inicio")
	public String index1() {
		return "./html/inicio.html";
	}

	@GetMapping("partida")
	public String index() {
		return "./html/partida.html";
	}
	
	
}
