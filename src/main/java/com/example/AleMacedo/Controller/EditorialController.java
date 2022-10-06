/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Controller;

import com.example.AleMacedo.Entity.Editorial;
import com.example.AleMacedo.Service.EditorialService;
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
@RequestMapping("/Editoriales")
@Api(value = "Microservicio de editoriales", description = "Microservicio de editoriales")
public class EditorialController {
    
    @Autowired
    EditorialService editorialService;
    
    @ApiOperation(value = "Lista de editoriales")
    @GetMapping("/all")
    public List<Editorial> findAll(){
        return editorialService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de una editorial")
    @GetMapping("/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id){
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }
    
    @ApiOperation(value = "Crea una editorial")
    @PostMapping("/save")
    public Editorial save(@RequestBody Editorial editorial){
        return editorialService.save(editorial);
    }
    
    @ApiOperation(value = "Modifica una editorial")
    @PutMapping("/update")
    public Editorial update(@RequestBody Editorial editorial){
        return editorialService.save(editorial);
    }
    
    @ApiOperation(value = "Elimina una editorial")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        editorialService.deleteById(id);
    }
    
}
