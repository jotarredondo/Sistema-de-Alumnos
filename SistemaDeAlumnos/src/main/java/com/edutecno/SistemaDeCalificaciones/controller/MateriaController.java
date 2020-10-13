package com.edutecno.SistemaDeCalificaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edutecno.SistemaDeCalificaciones.model.Materia;
import com.edutecno.SistemaDeCalificaciones.servicio.MateriaService;

@RestController
@RequestMapping("/api/v1/materia")
public class MateriaController {

	@Autowired
	MateriaService materiaServicio;
	
	@PostMapping
	public void create (@RequestBody Materia materia) {
	 materiaServicio.save(materia);
	}
	
	@GetMapping
	public List<Materia> findAll(){
		return materiaServicio.findAll();
	}
}
