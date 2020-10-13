package com.edutecno.SistemaDeCalificacionesFrontEnd.modelo;

import java.util.List;


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
public class AlumnoDto {
	
	private Long id;
	private String rut;
	private String nombre;
	private String direccion;
	private List<MateriaDto>materiaList;

}
