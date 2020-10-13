package com.edutecno.SistemaDeCalificaciones.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.SistemaDeCalificaciones.model.Alumno;
import com.edutecno.SistemaDeCalificaciones.servicio.AlumnoService;
import com.edutecno.SistemaDeCalificaciones.util.Log;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {
	
	
	
	@Autowired
	AlumnoService alumnoServicio;
	
	@Autowired
	Log log;
	
	
	@GetMapping("/{rut}")
	public Alumno findByRut (@PathVariable String rut) {
		
		return alumnoServicio.findByRut(rut);
	}
	
	@GetMapping
	public List<Alumno> findAll(){
		return alumnoServicio.findAll();
	}
	
	@PostMapping
	public void create(@RequestBody Alumno alumno) {
		alumnoServicio.save(alumno);
	}
	
}
