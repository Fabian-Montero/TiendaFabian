package com.TiendaFabian.demo.repository;

import com.TiendaFabian.demo.entity.Pais;
import com.TiendaFabian.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Long> {
    
}
