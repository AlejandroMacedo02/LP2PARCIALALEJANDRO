/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Repository;

import com.example.AleMacedo.Entity.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandromacedop
 */
@Repository
public interface EditorialRepository extends CrudRepository<Editorial, Long>{
    
}
