package com.edutecno.SistemaDeCalificacionesFrontEnd.servicio;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutecno.SistemaDeCalificacionesFrontEnd.modelo.AlumnoDto;

@Service
public class AlumnoServicioImp implements AlumnoServicio{

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public AlumnoDto findByRut(String rut) {
		
		return restTemplate.getForObject("http://localhost:8080/api/v1/alumno" + "/" + rut, AlumnoDto.class);
	}

	@Override
	public List<AlumnoDto> findAll() {
		
		AlumnoDto[] lista =  restTemplate.getForObject("http://localhost:8080/api/v1/alumno", AlumnoDto[].class);
	    List <AlumnoDto>searchList = Arrays.asList(lista);;
	
		return searchList;
	}

	@Override
	public void create(AlumnoDto alumno) {
		
		restTemplate.postForObject("http://localhost:8080/api/v1/alumno", alumno, AlumnoDto.class);
	}

}
