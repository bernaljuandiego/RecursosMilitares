package co.edu.konrad.recursosmilitares.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.edu.konrad.recursosmilitares.entities.RecursoHistoricoEntity;
import co.edu.konrad.recursosmilitares.persistence.RecursoHistoricoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Logica de negocio recurso historico
 * @author Uriel Rodríguez Vallarta
 */

@Stateless
public class RecursoHistoricoLogic {
    
    @Inject 
    private RecursoHistoricoPersistence recursoHistoricoPersistance; 
    
    /**
     * Obtener todos los recursos historicos
     * @return recursosHistoricos
     */
    public List<RecursoHistoricoEntity> getRecursoHistorico(){
      List<RecursoHistoricoEntity> recursosHistoricos = recursoHistoricoPersistance.findAll();
      return recursosHistoricos;
    }
    
    /**
     * Obtener un recurso historico a través del id
     * @param id
     * @return recursoHistorico
     */
    
    public  RecursoHistoricoEntity getRecursoHistorico(int id){
     RecursoHistoricoEntity recursoHistorico = recursoHistoricoPersistance.find(id);
        if (recursoHistorico == null) {
            throw new IllegalArgumentException("El recurso historico solicitada no existe");
        }
     return recursoHistorico;
    }
    
    /**
     * Crear un nuevo recurso historico
     * @param recursoHistoricoEntity
     * @return 
     */
    
    public RecursoHistoricoEntity createRecursoHistorico(RecursoHistoricoEntity recursoHistoricoEntity){
      recursoHistoricoPersistance.create(recursoHistoricoEntity); 
      return  recursoHistoricoEntity;
    }
    
    /**
     * Actualizar Recurso Historico
     * @param id
     * @param recursoHistoricoEntity
     * @return 
     */
    
    public RecursoHistoricoEntity updateRecursoHistorico(int id, RecursoHistoricoEntity recursoHistoricoEntity){
     RecursoHistoricoEntity recursoHistorico = recursoHistoricoPersistance.update(recursoHistoricoEntity); 
     return recursoHistorico;
    }
    
    /**
     * metodo para eliminar recurso historico de la tabla
     * @param id 
     */
    
    public void deleteRecursoHistorico(int id){
        recursoHistoricoPersistance.remove(id);
    }
}//class