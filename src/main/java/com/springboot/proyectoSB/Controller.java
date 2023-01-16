package com.springboot.proyectoSB;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	
	@GetMapping("/saludo") // localhost:8080/saludo
	public String saludo(){
		return "Holi Crayoli desde Spring Boot";
	}

}
