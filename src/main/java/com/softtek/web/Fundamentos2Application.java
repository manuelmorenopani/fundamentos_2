package com.softtek.web;

import com.softtek.web.Controlador.PacienteControlador;
import com.softtek.web.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Fundamentos2Application implements CommandLineRunner {
	@Autowired
	PacienteControlador pacienteControlador;
	public static void main(String[] args) {
		SpringApplication.run(Fundamentos2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Paciente paciente = new Paciente(1234123,"Manuel",123456789);
	System.out.println(pacienteControlador.obtener(paciente));

	}
}
