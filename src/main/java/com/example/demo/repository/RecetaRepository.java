package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Receta;

@Repository
public interface RecetaRepository extends CrudRepository<Receta, Long> {
	
    Receta findByNombre(String nombre);
    Optional<Receta> findById(Long id);
//    Receta add(Receta receta);
 //   Receta save(Receta receta);
}
