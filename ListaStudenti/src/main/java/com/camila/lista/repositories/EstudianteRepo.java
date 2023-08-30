package com.camila.lista.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camila.lista.models.EstudianteModel;

@Repository
public interface EstudianteRepo extends CrudRepository<EstudianteModel, Long> {

	List<EstudianteModel> findAll();

	@SuppressWarnings("unchecked")
	EstudianteModel save(EstudianteModel estudiante);

	List<EstudianteModel> findByContactoModelIsNull();

	
	
}
