/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Controller;

import com.example.AleMacedo.Entity.Libro;
import com.example.AleMacedo.Service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejandromacedop
 */
@RestController
@RequestMapping("/Libro")
@Api(value = "Microservicio de libros", description = "Microservicio de libros")
public class LibroController {
    
    @Autowired
    LibroService libroService;
    
    @ApiOperation(value = "Lista de libros")
    @GetMapping("/all")
    public List<Libro> findAll(){
        return libroService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un libro")
    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id){
        Libro libro = libroService.findById(id);
        return ResponseEntity.ok(libro);
    }
    
    @ApiOperation(value = "Crea una libro")
    @PostMapping("/save")
    public Libro save(@RequestBody Libro libro){
        return libroService.save(libro);
    }
    
    @ApiOperation(value = "Modifica un libro")
    @PutMapping("/update")
    public Libro update(@RequestBody Libro libro){
        return libroService.save(libro);
    }
    
    @ApiOperation(value = "Elimina un libro")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        libroService.deleteById(id);
    }
    
}

