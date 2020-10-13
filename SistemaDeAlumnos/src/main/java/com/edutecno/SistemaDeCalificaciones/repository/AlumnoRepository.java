package com.edutecno.SistemaDeCalificaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.SistemaDeCalificaciones.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	
	Alumno findByRut(String rut);

}
