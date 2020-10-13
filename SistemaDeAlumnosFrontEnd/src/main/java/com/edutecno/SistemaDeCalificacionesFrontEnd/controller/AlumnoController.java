package com.edutecno.SistemaDeCalificacionesFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.AlumnoDto;
import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.MateriaDto;
import com.edutecno.SistemaDeCalificacionesFrontEnd.servicio.AlumnoServicio;
import com.edutecno.SistemaDeCalificacionesFrontEnd.servicio.MateriaServicio;

@Controller
public class AlumnoController {
	
	@Autowired
	AlumnoServicio alumnoServicio;
	
	@Autowired
	MateriaServicio materiaServicio;
	
	
	@GetMapping("/")
	public String inicio () {
		return "index";
	}
	
	
	
	@GetMapping("/alumnos")
	public String listarAlumnos (ModelMap modelo) {
		
		List<AlumnoDto> lista = alumnoServicio.findAll();
		modelo.addAttribute("lista", lista);
		return "alumnos";
	}
	
	
	@GetMapping("formulario")
	public String inscripcionAlumnos (ModelMap modelo) {
		
		List<MateriaDto> lista = materiaServicio.findAll();
		
		modelo.addAttribute("lista", lista); 
		return "inscripcion";
	}
	
	@PostMapping("inscripcion")
	public String crearAlumno(@ModelAttribute AlumnoDto alumno,@RequestParam String materia) {
		
		alumnoServicio.create(alumno);
		
		return "index";
	}
	

}
