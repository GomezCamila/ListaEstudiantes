package com.camila.lista.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.lista.models.ContactoModel;
import com.camila.lista.models.EstudianteModel;
import com.camila.lista.repositories.ContactoRepo;
import com.camila.lista.repositories.EstudianteRepo;
import com.camila.lista.repositories.ContactoRepo;
import com.camila.lista.repositories.EstudianteRepo;
@SuppressWarnings("unused")
@Service
public class MainService {

	
	//INYECCION DEPENDENCIAS
	
	@Autowired
	private EstudianteRepo estudianteRepo;
	@Autowired
	private ContactoRepo contactoRepo;
	
	//PERSONA
	public EstudianteModel crearEstudiante(EstudianteModel estudiante) {
		return estudianteRepo.save(estudiante);
	}
	public List<EstudianteModel> todosEstudiantes(){
		return estudianteRepo.findAll();
	}
	
	
	//LICENCIA
	
	public ContactoModel crearContacto(ContactoModel contacto) {
		return contactoRepo.save(contacto);
	}
	public List<EstudianteModel> obtenerEstudianteSinContacto(){
		return estudianteRepo.findByContactoModelIsNull();
	}
	
	public EstudianteModel buscarEstudianteSinContacto(Long id) {
		Optional<EstudianteModel> optionalEstudiante= estudianteRepo.findById(id);
	return optionalEstudiante.orElse(null);
	}
	
	
	
	
	
	
	public MainService() {
		
	}

}
