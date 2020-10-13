package com.edutecno.SistemaDeCalificacionesFrontEnd.servicio;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.AlumnoDto;
import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.MateriaDto;

@Service
public class MateriaServicioImp implements MateriaServicio {
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public void create(MateriaDto materia) {
		
		restTemplate.postForObject("http://localhost:8080/api/v1/materia", materia, AlumnoDto.class);
		
	}

	
	@Override
	public List<MateriaDto> findAll() {
		
		MateriaDto[] lista =  restTemplate.getForObject("http://localhost:8080/api/v1/materia", MateriaDto[].class);
	    List <MateriaDto>searchList = Arrays.asList(lista);;
	
		return searchList;
	}
	
}
