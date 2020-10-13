package com.edutecno.SistemaDeCalificaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SistemaDeCalificacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeCalificacionesApplication.class, args);
		
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
//		AlumnoService alumnoDao = acac.getBean(AlumnoService.class);
//		MateriaService materia = acac.getBean(MateriaService.class);
//		System.out.println(materia.findAll());
	}

}
