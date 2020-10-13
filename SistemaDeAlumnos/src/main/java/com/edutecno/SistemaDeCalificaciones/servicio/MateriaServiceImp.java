package com.edutecno.SistemaDeCalificaciones.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.SistemaDeCalificaciones.model.Materia;
import com.edutecno.SistemaDeCalificaciones.repository.MateriaRepository;
import com.edutecno.SistemaDeCalificaciones.util.Log;

@Service
public class MateriaServiceImp implements MateriaService{
	
	
	@Autowired
	MateriaRepository materiaRepository;
	
	@Autowired
	Log log;
	

	@Override
	public void save(Materia materia) {
		
		log.mostrarMensaje("Guardando materia");
		materiaRepository.save(materia);
		
	}

	@Override
	public List<Materia> findAll() {
		return materiaRepository.findAll();
	}

}
