/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase encargada de modelar la tabla Categoria
 * @author Uriel Rodríguez Vallarta
 */
/**
 * Nombre de la tabla que va a almacenar la información acerca de la categoria
 */
@Entity (name = "Categoria")
public class CategoriaEntity implements Serializable{
    
      /**
     * LLave primaria de la tabla Categoria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_categoria;
    
    /**
     * Atributo nom_tipo_recurso, este es una llave foranea la cual conecta con 
     * la tabla Categoria, nos permitira manejar el nombre de la categoria
     */    
    @Column (name = "nom_categoria", nullable = false)
    private String nom_categoria; 
    
    /**
     * Constructor por defecto
     */
    public CategoriaEntity() {
    }
      
    /**
     * ------------- METODOS GET Y SET -------------- 
     */
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNom_categoria() {
        return nom_categoria;
    }

    public void setNom_categoria(String nom_categoria) {
        this.nom_categoria = nom_categoria;
    }
   
}//Clase