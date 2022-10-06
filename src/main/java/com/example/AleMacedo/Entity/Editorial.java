/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AleMacedo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Data
@Table(name = "editorial")
public class Editorial {
    
    @Id
    @Column(name = "editorial_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editorialId;
    
    @Column(name = "editorial_nombre")
    private String editorialNombre;
    
    @JoinColumn(name = "editorial_autor")
    private String editorialDescripcion;     
    
    
}
