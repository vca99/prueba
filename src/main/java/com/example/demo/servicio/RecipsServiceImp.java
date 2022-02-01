package com.example.demo.servicio;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Receta;
import com.example.demo.repository.RecetaRepository;
import com.example.demo.utils.DuplicateRecetaException;

@Service
public class RecipsServiceImp implements RecipsService{

	private final RecetaRepository recetaRepository = null;
//	   https://www.baeldung.com/spring-boot-jsp   
	@Override
	public Collection<Receta> getRecetas() {
		
		return null;
	}

	@Override
	public Receta addReceta(Receta receta) {
		
		final Optional<Receta> existingReceta = recetaRepository.findById(receta.getId());
        if (existingReceta.isPresent()) {
            throw new DuplicateRecetaException(receta);
        }

  //      final Receta savedReceta = recetaRepository.add(convertReceta(receta));
   //     final Receta savedReceta = recetaRepository.add(receta);
        final Receta savedReceta = recetaRepository.save(receta);
   //     return convertRecetaData(savedReceta);
        return savedReceta;

	}

}
