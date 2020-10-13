package com.edutecno.SistemaDeCalificaciones.servicio;

import java.util.List;


import com.edutecno.SistemaDeCalificaciones.model.Materia;

public interface MateriaService {
	
	void save(Materia materia);
	
	List<Materia> findAll(); 
	

}
