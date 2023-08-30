package com.camila.lista.models;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="contacto")
public class ContactoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@NotBlank(message="Por favor, completar el campo")
	private String state;
	@NotBlank(message="Por favor, completar el campo")
	private String city;
	@NotBlank(message="Por favor, completar el campo")
	private String address;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="estudiante_id")
	private EstudianteModel estudianteModel;
	
	//Constructor
	public ContactoModel() {
		
	}

	//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public EstudianteModel getEstudianteModel() {
		return estudianteModel;
	}

	public void setEstudianteModel(EstudianteModel estudianteModel) {
		this.estudianteModel = estudianteModel;
	}
	
	
	
	
}
