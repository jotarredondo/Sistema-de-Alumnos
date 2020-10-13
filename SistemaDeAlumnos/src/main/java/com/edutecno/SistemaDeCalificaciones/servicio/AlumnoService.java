package com.edutecno.SistemaDeCalificaciones.servicio;

import java.util.List;

import com.edutecno.SistemaDeCalificaciones.model.Alumno;

public interface AlumnoService {
	
	
	void save(Alumno alumno);
	
	Alumno findByRut(String rut);
	
	List<Alumno> findAll(); 

}
