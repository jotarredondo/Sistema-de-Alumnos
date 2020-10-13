package com.edutecno.SistemaDeCalificacionesFrontEnd.servicio;


import java.util.List;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.MateriaDto;


public interface MateriaServicio {
	
	
	public List<MateriaDto> findAll();
	
	public void create (MateriaDto materia);

}
