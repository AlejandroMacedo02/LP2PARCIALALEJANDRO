/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Service.Impl;

import com.example.AleMacedo.Entity.Editorial;
import com.example.AleMacedo.Repository.EditorialRepository;
import com.example.AleMacedo.Service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class EditorialServiceImpl implements EditorialService{
    
    @Autowired
    EditorialRepository editorialrepository;

    @Override
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialrepository.findAll();
    }

    @Override
    public Editorial findById(Long id) {
        return editorialrepository.findById(id).orElse(null);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialrepository.save(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
        editorialrepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        editorialrepository.deleteById(id);
    }
    
}

