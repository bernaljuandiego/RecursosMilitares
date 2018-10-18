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
 * Clase encargada de modelar la tabla Recurso Historico
 * @author Uriel Rodríguez Vallarta
 */
/**
 * Nombre de la tabla que va a almacenar la información acerca del Recurso Historico
 */
@Entity (name = "RecursoHistorico")
public class RecursoHistoricoEntity implements Serializable{
    
     /**
     * LLave primaria de la tabla Recurso historico
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    @Column (name = "id_recurso_historico", nullable = false)
    private int id_recurso_historico;
 
    /**
     * Atributo que maneja la fecha de adquisicion del recurso
     */
    @Column(name = "fecha_adquisicion", nullable = false)
    private String fecha_adquisicion;
    
    /**
     * Atributo que maneja el estado del recurso
     */
    @Column(name = "estado", nullable = false)
    private String estado;
    
    /**
     * Atributo que maneja el estado de la ubicación del recurso
     */
    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;
    
    /**
     * Atributo militar_remitente_id, está es una llave foranea la cual conecta con 
     * la tabla Militar
     */
    @Column(name = "militar_remitente_id", nullable = false)
    private int militar_remitente_id;
    
    /**
     * Atributo militar_receptor_id, está es una llave foranea la cual conecta con 
     * la tabla Militar
     */
    @Column(name = "militar_receptor_id", nullable = false)
    private int militar_receptor_id;
    
    /**
     * Atributo recurso_id_recurso, este es una llave foranea la cual conecta con 
     * la tabla de Recurso
     */    
    @Column (name = "recurso_id_recurso", nullable = false)
    private int recurso_id_recurso; 
    
    /**
     * Constructor por defecto
     */
    public RecursoHistoricoEntity() {
    }

    /**
     * ------------- METODOS GET Y SET -------------- 
     */
    public int getId_recurso_historico() {
        return id_recurso_historico;
    }

    public void setId_recurso_historico(int id_recurso_historico) {
        this.id_recurso_historico = id_recurso_historico;
    }

    public String getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(String fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMilitar_remitente_id() {
        return militar_remitente_id;
    }

    public void setMilitar_remitente_id(int militar_remitente_id) {
        this.militar_remitente_id = militar_remitente_id;
    }

    public int getMilitar_receptor_id() {
        return militar_receptor_id;
    }

    public void setMilitar_receptor_id(int militar_receptor_id) {
        this.militar_receptor_id = militar_receptor_id;
    }

    public int getRecurso_id_recurso() {
        return recurso_id_recurso;
    }

    public void setRecurso_id_recurso(int recurso_id_recurso) {
        this.recurso_id_recurso = recurso_id_recurso;
    }
    
}//clase
