package com.numerosromanos.practica1spring;

import Controllers.RomanNumberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = RomanNumberController.class)
public class Practica1springApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica1springApplication.class, args);
	}

}
