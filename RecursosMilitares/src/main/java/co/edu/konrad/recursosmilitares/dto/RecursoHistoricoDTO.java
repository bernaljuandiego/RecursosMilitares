/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.RecursoHistoricoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite hacer la transferencia a recurso historico
 * @author Uriel Rodríguez Vallarta
 */
public class RecursoHistoricoDTO {
   
  /**
   * Lista de atributos que hacen referencia al objeto recurso historico
   */    
  private int id_recurso_historico;
  private String fecha_adquisicion;
  private String estado;
  private String ubicacion;
  private int militar_remitente_id;
  private int militar_receptor_id;
  private int recurso_id_recurso; 
  
  /**
   * Constructor por defecto
   */  
  
    public RecursoHistoricoDTO() {
    }
 
    /**
     * Mapeo de Entidad a Objeto
     * @param RecursoHistoricoEntity 
     */
    public RecursoHistoricoDTO(RecursoHistoricoEntity RecursoHistoricoEntity) {
        this.id_recurso_historico = RecursoHistoricoEntity.getId_recurso_historico();
        this.fecha_adquisicion = RecursoHistoricoEntity.getFecha_adquisicion();
        this.estado = RecursoHistoricoEntity.getEstado();
        this.ubicacion = RecursoHistoricoEntity.getUbicacion();
        this.militar_remitente_id = RecursoHistoricoEntity.getMilitar_remitente_id();
        this.militar_receptor_id = RecursoHistoricoEntity.getMilitar_receptor_id(); 
        this.recurso_id_recurso = RecursoHistoricoEntity.getRecurso_id_recurso();  
    }
    
    /**
     * Mapear de Objeto a Entidad
     * @return 
     */

    public RecursoHistoricoEntity toEntity(){
        RecursoHistoricoEntity entity = new RecursoHistoricoEntity(); 
        entity.setId_recurso_historico(this.id_recurso_historico);
        entity.setFecha_adquisicion(this.fecha_adquisicion);
        entity.setEstado(this.estado);
        entity.setUbicacion(this.ubicacion);
        entity.setMilitar_remitente_id(this.militar_remitente_id);
        entity.setMilitar_receptor_id(this.militar_receptor_id);
        entity.setRecurso_id_recurso(this.recurso_id_recurso);
        
        return entity;
    }
    
    /**
     * Conversor lista entidad a lista de objetos tipo recurso
     * @param RecursoHistoricoEntitys
     * @return 
     */
    
    public static List<RecursoHistoricoDTO> tolistRecursoHistorico(List<RecursoHistoricoEntity> RecursoHistoricoEntitys){
        
        List<RecursoHistoricoDTO> listaObjectoRecursoHistorico = new ArrayList<>();
        for (int i = 0; i <RecursoHistoricoEntitys.size(); i++) {
            listaObjectoRecursoHistorico.add(new RecursoHistoricoDTO(RecursoHistoricoEntitys.get(i)));
        }
        return listaObjectoRecursoHistorico;
    }

    /**
     * Metodos GET AND SET
     * @return 
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
}//class