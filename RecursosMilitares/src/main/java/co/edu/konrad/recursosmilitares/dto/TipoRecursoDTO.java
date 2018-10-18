/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.TipoRecursoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite hacer la transferencia a tipo recurso
 * @author Uriel Rodríguez Vallarta
 */
public class TipoRecursoDTO {
   
  /**
   * Lista de atributos que hacen referencia al objeto tipo recurso
   */    
  private int id_tipo_recurso;
  private String nom_tipo_recurso;
  
  /**
   * Constructor por defecto
   */  
  
    public TipoRecursoDTO() {
    }
 
    /**
     * Mapeo de Entidad a Objeto
     * @param TipoRecursoEntity 
     */
    public TipoRecursoDTO(TipoRecursoEntity TipoRecursoEntity) {
        this.id_tipo_recurso = TipoRecursoEntity.getId_tipo_recurso();
        this.nom_tipo_recurso = TipoRecursoEntity.getNom_tipo_recurso();
    }
    
    /**
     * Mapear de Objeto a Entidad
     * @return 
     */

    public TipoRecursoEntity toEntity(){
        TipoRecursoEntity entity = new TipoRecursoEntity(); 
        entity.setId_tipo_recurso(this.id_tipo_recurso);
        entity.setNom_tipo_recurso(this.nom_tipo_recurso);
        
        return entity;
    }
    
    /**
     * Conversor lista entidad a lista de objetos tipo recurso
     * @param tipoRecursoEntitys
     * @return 
     */
    
    public static List<TipoRecursoDTO> tolistTipoRecurso(List<TipoRecursoEntity> tipoRecursoEntitys){
        
        List<TipoRecursoDTO> listaObjectoTipoRecurso = new ArrayList<>();
        for (int i = 0; i <tipoRecursoEntitys.size(); i++) {
            listaObjectoTipoRecurso.add(new TipoRecursoDTO(tipoRecursoEntitys.get(i)));
        }
        return listaObjectoTipoRecurso;
    }
    
    /**
     * Metodos GET AND SET
     * @return 
     */
     
    public int getId_tipo_recurso() {
        return id_tipo_recurso;
    }

    public void setId_tipo_recurso(int id_tipo_recurso) {
        this.id_tipo_recurso = id_tipo_recurso;
    }

    public String getNom_tipo_recurso() {
        return nom_tipo_recurso;
    }

    public void setNom_tipo_recurso(String nom_tipo_recurso) {
        this.nom_tipo_recurso = nom_tipo_recurso;
    }
}//class