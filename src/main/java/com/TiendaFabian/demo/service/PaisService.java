/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaFabian.demo.service;

import com.TiendaFabian.demo.entity.Pais;
import com.TiendaFabian.demo.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fabia
 */
@Service
public class PaisService implements IPaisService{
    
    @Autowired
    private PaisRepository paisRepository;
    

    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }
}
