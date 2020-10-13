package com.edutecno.SistemaDeCalificaciones.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rut;
	private String nombre;
	private String direccion;
	
	
	@OneToMany(mappedBy="alumno", fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Materia>materiaList;

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}



}
