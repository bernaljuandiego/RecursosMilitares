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
 * Clase encargada de modelar la tabla Recurso
 * @author Uriel Rodríguez Vallarta
 */
/**
 * Nombre de la tabla que va a almacenar la información acerca del Recurso
 */
@Entity (name = "Recurso")
public class RecursoEntity implements Serializable{
    
     /**
     * LLave primaria de la tabla Recurso
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column (name = "id_recurso", nullable = false)
    private int id_recurso;
    
     /**
     * Atributo que maneja nombre del recurso
     */
    @Column(name = "nom_recurso", nullable = false)
    private String nom_recurso;
    
    /**
     * Atributo que maneja la cantidad del recurso
     */
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    
    /**
     * Atributo que maneja la descripción del recurso
     */
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    
    /**
     * Atributo que maneja el numero serial del recurso
     */
    @Column(name = "serial", nullable = false)
    private int serial;
    
    /**
     * Atributo que maneja el estado del recurso
     */
    @Column(name = "estado", nullable = false)
    private String estado;
    
    /**
     * Atributo tipo_recurso_id, está es una llave foranea la cual conecta con 
     * la tabla que maneja los tipos del recurso
     */
    @Column(name = "tipo_recurso_id", nullable = false)
    private int tipo_recurso_id;
    
    /**
     * Atributo categoria_id_categoria, este es una llave foranea la cual conecta con 
     * la tabla de categoria
     */    
    @Column (name = "categoria_id_categoria", nullable = false)
    private int categoria_id_categoria; 
    
    /**
     * Constructor por defecto
     */
    public RecursoEntity() {
    }
    
    /**
     * ------------- METODOS GET Y SET -------------- 
     */
    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    public String getNom_recurso() {
        return nom_recurso;
    }

    public void setNom_recurso(String nom_recurso) {
        this.nom_recurso = nom_recurso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTipo_recurso_id() {
        return tipo_recurso_id;
    }

    public void setTipo_recurso_id(int tipo_recurso_id) {
        this.tipo_recurso_id = tipo_recurso_id;
    }

    public int getCategoria_id_categoria() {
        return categoria_id_categoria;
    }

    public void setCategoria_id_categoria(int categoria_id_categoria) {
        this.categoria_id_categoria = categoria_id_categoria;
    }
}//clase
