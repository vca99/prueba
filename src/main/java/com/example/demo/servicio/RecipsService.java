package com.example.demo.servicio;

import java.util.Collection;



import com.example.demo.model.Receta;


public interface RecipsService {
	
	 Collection<Receta> getRecetas();
	 Receta addReceta(Receta receta);

}
