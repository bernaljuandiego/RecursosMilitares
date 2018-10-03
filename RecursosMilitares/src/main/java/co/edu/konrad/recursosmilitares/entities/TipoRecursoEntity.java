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
 * Clase encargada de modelar la tabla Tipo_Recurso
 * @author Uriel Rodríguez Vallarta
 */
/**
 * Nombre de la tabla que va a almacenar la información acerca del tipo de recurso
 */
@Entity (name = "TipoRecurso")
public class TipoRecursoEntity implements Serializable{
    
      /**
     * LLave primaria de la tabla Tipo_Recurso
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_tipo_recurso;
    
    /**
     * Atributo que nos permitira manejar el nombre del tipo recurso
     */    
    @Column (name = "nom_tipo_recurso", nullable = false)
    private int nom_tipo_recurso; 
    
    /**
     * Constructor por defecto
     */
    public TipoRecursoEntity() {
    }
    
    /**
     * ------------- METODOS GET Y SET -------------- 
     */
    
    public int getId_tipo_recurso() {
        return id_tipo_recurso;
    }

    public void setId_tipo_recurso(int id_tipo_recurso) {
        this.id_tipo_recurso = id_tipo_recurso;
    }

    public int getNom_tipo_recurso() {
        return nom_tipo_recurso;
    }

    public void setNom_tipo_recurso(int nom_tipo_recurso) {
        this.nom_tipo_recurso = nom_tipo_recurso;
    }
   
}//Clase
