package com.JuegoTrivia.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJuegoJpaRepository;


@Controller

public class controllerRegistro {

	

		
	@Autowired
	private UsuarioJuegoJpaRepository usuarioJpaRepository;
	
	
			@GetMapping("registro")
			public String registro() {
		return "./html/registro";
	}
	
	
			
			
			
			@PostMapping("/registro")
			public String guardarUsuario(Usuario usuariosACrear) {
				System.out.println(usuariosACrear.toString());
				usuarioJpaRepository.save(usuariosACrear);
					return "./html/inicio";
			}
		
			
		}



