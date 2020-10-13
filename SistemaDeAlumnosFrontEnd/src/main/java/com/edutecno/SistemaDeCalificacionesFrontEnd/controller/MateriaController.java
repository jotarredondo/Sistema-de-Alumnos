package com.edutecno.SistemaDeCalificacionesFrontEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.MateriaDto;
import com.edutecno.SistemaDeCalificacionesFrontEnd.servicio.MateriaServicio;

@Controller
public class MateriaController {
	
	@Autowired
	MateriaServicio materiaServicio;
	
	
	@GetMapping("materias")
	public String listarmaterias (ModelMap modelo) {
		List<MateriaDto> lista = materiaServicio.findAll();
		modelo.addAttribute("lista", lista);
		return "materias";
	}
	
	@GetMapping("crearMateria")
	public String crear() {
		
		return "crearMateria";
	}
	
	

	@PostMapping("crearMateria")
	public String crearMateria(@ModelAttribute MateriaDto materia) {
		
		materiaServicio.create(materia);
		
		return "index";
	}
}
