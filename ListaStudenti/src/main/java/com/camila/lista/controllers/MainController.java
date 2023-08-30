package com.camila.lista.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.camila.lista.models.ContactoModel;
import com.camila.lista.models.EstudianteModel;
import com.camila.lista.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	//INYECCIONES DE DEPENDENCIA
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String raiz() {
		return "redirect:/students";
	}

	@GetMapping("/students")
	public String root(Model viewModel) {
		List<EstudianteModel> todosEstudiantes= mainService.todosEstudiantes();
		viewModel.addAttribute("todos", todosEstudiantes);
		return "/show.jsp";
	}
	
	@GetMapping("/students/new")
	public String formEstudiante(@ModelAttribute("estudiante") EstudianteModel estudiante) {
		return "newE.jsp";
	}
	@PostMapping("/students/new")
	public String crearEstudiante(@Valid @ModelAttribute("estudiante")EstudianteModel estudiante, BindingResult result) {
		if(result.hasErrors()) {
			return "newE.jsp";
		}
	mainService.crearEstudiante(estudiante);
	return "redirect:/";
	
	}
	@GetMapping("/contact/new")
	public String formContacto(@ModelAttribute("contacto")ContactoModel contacto, Model viewModel) {
		viewModel.addAttribute("estudiantes", mainService.obtenerEstudianteSinContacto());
		return "novocontatto.jsp";
	}
	@PostMapping("/contact/new")
	public String crearContacto(@Valid @ModelAttribute("contacto")ContactoModel contacto,  BindingResult result) {
		if(result.hasErrors()) {
			return "novocontatto.jsp";
		}
		mainService.crearContacto(contacto);
		return "redirect:/";
	}
	
	
}
