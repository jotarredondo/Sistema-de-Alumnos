package com.edutecno.SistemaDeCalificacionesFrontEnd.servicio;

import java.util.List;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.AlumnoDto;

public interface AlumnoServicio {
	
	public AlumnoDto findByRut(String rut);
	
	public List<AlumnoDto> findAll();
	
	public void create (AlumnoDto alumno);

}
