/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Service;

import com.example.AleMacedo.Entity.Libro;
import java.util.List;

/**
 *
 * @author alejandromacedop
 */
public interface LibroService {
    
    public List<Libro> findAll();
    public Libro findById(Long id);
    public Libro save (Libro libro);
    public void delete(Libro libro);
    public void deleteById(Long id);
    
}

