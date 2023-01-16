package com.springboot.proyectoSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProyectoSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSbApplication.class, args);
	}

}
