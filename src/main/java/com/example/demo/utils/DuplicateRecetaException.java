package com.example.demo.utils;

import com.example.demo.model.Receta;

public class DuplicateRecetaException extends RuntimeException{
	
	private final Receta receta;

	public Receta getReceta() {
		return receta;
	}

	public DuplicateRecetaException(Receta receta) {
		super();
		this.receta = receta;
	}
	
	

}
