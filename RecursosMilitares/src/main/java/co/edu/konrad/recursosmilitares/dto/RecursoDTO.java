/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.RecursoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite hacer la transferencia a recurso
 * @author Uriel Rodríguez Vallarta
 */
public class RecursoDTO {
   
  /**
   * Lista de atributos que hacen referencia al objeto recurso
   */    
  private int id_recurso;
  private String nom_recurso;
  private int cantidad;
  private String descripcion;
  private int serial;
  private String estado;
  private int tipo_recurso_id;
  private int categoria_id_categoria; 
  
  /**
   * Constructor por defecto
   */  
  
    public RecursoDTO() {
    }
 
    /**
     * Mapeo de Entidad a Objeto
     * @param RecursoEntity 
     */
    public RecursoDTO(RecursoEntity RecursoEntity) {
        this.id_recurso = RecursoEntity.getId_recurso();
        this.nom_recurso = RecursoEntity.getNom_recurso();
        this.cantidad = RecursoEntity.getCantidad();
        this.descripcion = RecursoEntity.getDescripcion();
        this.serial = RecursoEntity.getSerial();
        this.estado = RecursoEntity.getEstado();
        this.tipo_recurso_id = RecursoEntity.getTipo_recurso_id();
        this.categoria_id_categoria = RecursoEntity.getCategoria_id_categoria();  
    }
    
    /**
     * Mapear de Objeto a Entidad
     * @return 
     */

    public RecursoEntity toEntity(){
        RecursoEntity entity = new RecursoEntity(); 
        entity.setId_recurso(this.id_recurso);
        entity.setNom_recurso(this.nom_recurso);
        entity.setCantidad(this.cantidad);
        entity.setDescripcion(this.descripcion);
        entity.setSerial(this.serial);
        entity.setEstado(estado);
        entity.setTipo_recurso_id(tipo_recurso_id);
        entity.setCategoria_id_categoria(categoria_id_categoria);
        
        return entity;
    }
    
    /**
     * Conversor lista entidad a lista de objetos tipo recurso
     * @param RecursoEntitys
     * @return 
     */
    
    public static List<RecursoDTO> tolistRecurso(List<RecursoEntity> RecursoEntitys){
        
        List<RecursoDTO> listaObjectoRecurso = new ArrayList<>();
        for (int i = 0; i <RecursoEntitys.size(); i++) {
            listaObjectoRecurso.add(new RecursoDTO(RecursoEntitys.get(i)));
        }
        return listaObjectoRecurso;
    }
    
    /**
     * Metodos GET AND SET
     * @return 
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
}//class