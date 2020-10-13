package com.edutecno.SistemaDeCalificacionesFrontEnd.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MateriaDto {
	

	private Long id;
	private String nombre;
	private AlumnoDto alumno;

	

}
