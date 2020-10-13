package com.edutecno.SistemaDeCalificaciones.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.SistemaDeCalificaciones.model.Alumno;
import com.edutecno.SistemaDeCalificaciones.repository.AlumnoRepository;
import com.edutecno.SistemaDeCalificaciones.util.Log;

@Service
public class AlumnoServiceImp implements AlumnoService{

	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Autowired
	Log log;
	
	
	@Override
	public void save(Alumno alumno) {
		
		log.mostrarMensaje("Guardando alumno");
		alumnoRepository.save(alumno);
			
	}

	@Override
	public Alumno findByRut(String rut) {	
		
		return alumnoRepository.findByRut(rut);
	}

	@Override
	public List<Alumno> findAll() {
		
		return alumnoRepository.findAll();
	}

}
