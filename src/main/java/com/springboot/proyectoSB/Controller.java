package com.springboot.proyectoSB;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	
	@GetMapping("/main") // localhost:8080/saludo
	public String saludo(){
		return "Main del Proyecto";
	}

}
