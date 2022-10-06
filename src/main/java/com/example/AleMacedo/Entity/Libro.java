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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Data
@Table(name = "libro")
public class Libro {
    
    @Id
    @Column(name = "libro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libroId;
    
    @ManyToOne
    @JoinColumn(name = "libro_nombre")
    private Editorial editorial;
    
    @Column(name = "libro_resumen")
    private String libroresumen;
    
    @Column(name = "libro_autor")
    private String libroautor;
    
    @Column(name = "libro_precio")
    private int proPrecio;
    
    @Column (name = "libro_stock")
    private String librostock;
    
   
    @JoinColumn(name = "libro_id")
    private String librid;
    
}
