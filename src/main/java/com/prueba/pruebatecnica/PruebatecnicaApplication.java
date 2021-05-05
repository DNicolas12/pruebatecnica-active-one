package com.prueba.pruebatecnica;

import com.prueba.pruebatecnica.ejercicio01.Ejercicio01;
import com.prueba.pruebatecnica.ejercicio02.Ejercicio02;
import com.prueba.pruebatecnica.ejercicio03.Ejercicio03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebatecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}

	@Bean
	public Ejercicio02 ejercicio02(){
		Ejercicio02 ejercicio02 = new Ejercicio02();

		ejercicio02.llenarMatriz();

		return ejercicio02;
	}

	@Bean
	public Ejercicio01 ejercicio01(){
		Ejercicio01 ejercicio01 = new Ejercicio01();

		return ejercicio01;
	}

	@Bean
	public Ejercicio03 ejercicio03(){
		Ejercicio03 ejercicio03 = new Ejercicio03();
		
		return ejercicio03;
	}
}
