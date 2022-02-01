package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Receta")
public class Receta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String ingredientes;
	 private String pasos;
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getPasos() {
		return pasos;
	}
	public void setPasos(String pasos) {
		this.pasos = pasos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Receta(Long id, String nombre, String ingredientes, String pasos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.pasos = pasos;
	}
	public Receta() {
		
	}
	 
	 

}
