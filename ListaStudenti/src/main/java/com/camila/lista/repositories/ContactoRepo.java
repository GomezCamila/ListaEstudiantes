package com.camila.lista.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camila.lista.models.ContactoModel;

@Repository





public interface ContactoRepo extends CrudRepository<ContactoModel, Long> {

}
