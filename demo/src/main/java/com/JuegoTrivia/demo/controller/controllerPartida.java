/**
 * 
 */
package com.JuegoTrivia.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJuegoJpaRepository;

import java.util.Optional;

/**
 * @author tere_
 *
 */
@Controller
public class controllerPartida {
	
	@Autowired
	private UsuarioJuegoJpaRepository usuarioRepo;
	

	@GetMapping("Partida")
	public String partida(Model model) {
		Optional<Usuario> opt = usuarioRepo.findById(1);
		Usuario usuario = opt.get();
		model.addAttribute("usuario", usuario);
		return "./html/partida.html";
	
	
	}
}
