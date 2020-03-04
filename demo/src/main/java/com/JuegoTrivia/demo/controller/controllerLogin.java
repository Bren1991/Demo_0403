package com.JuegoTrivia.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJuegoJpaRepository;


@Controller
public class controllerLogin {
	
		@GetMapping("login")
		public String login() {
			return "./html/login.html";
	
	}
		@Autowired
		private UsuarioJuegoJpaRepository UsuarioJpaRepository;
		
				
			@PostMapping("/")
				public String irAlUser(Model model,Usuario user) {
					
				String nombreIngresado = user.getNombre();
				String contraseniaIngresada = user.getPassword();

				Usuario usuarioEncontrado = UsuarioJpaRepository.findByNombre(nombreIngresado);

				
				if(usuarioEncontrado == null) {	
					return "error";
				}
				 
								

					if(usuarioEncontrado.getPassword().equals(contraseniaIngresada)) {
						model.addAttribute("usuario", usuarioEncontrado);
						
						return "./html/partida.html";
					} else {
						return "./html/login.html";
					}
				}

		

}
