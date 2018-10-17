package co.edu.konrad.recursosmilitares.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.edu.konrad.recursosmilitares.entities.RecursoEntity;
import co.edu.konrad.recursosmilitares.persistence.RecursoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Logica de negocio recurso
 * @author Uriel Rodríguez Vallarta
 */

@Stateless
public class RecursoLogic {
    
    @Inject 
    private RecursoPersistence recursoPersistance; 
    
    /**
     * Obtener todos los recursos
     * @return recursos
     */
    public List<RecursoEntity> getRecurso(){
      List<RecursoEntity> recursos = recursoPersistance.findAll();
      return recursos;
    }
    
    /**
     * Obtener un recurso a través del id
     * @param id
     * @return recurso
     */
    
    public  RecursoEntity getRecurso(int id){
     RecursoEntity recurso = recursoPersistance.find(id);
        if (recurso == null) {
            throw new IllegalArgumentException("El recurso solicitada no existe");
        }
     return recurso;
    }
    
    /**
     * Crear un nuevo recurso
     * @param recursoEntity
     * @return 
     */
    
    public RecursoEntity createRecurso(RecursoEntity recursoEntity){
      recursoPersistance.create(recursoEntity); 
      return  recursoEntity;
    }
    
    /**
     * Actualizar Recurso
     * @param id
     * @param recursoEntity
     * @return 
     */
    
    public RecursoEntity updateRecurso(int id, RecursoEntity recursoEntity){
     RecursoEntity recurso = recursoPersistance.update(recursoEntity); 
     return recurso;
    }
    
    /**
     * metodo para eliminar recurso de la tabla
     * @param id 
     */
    
    public void deleteRecurso(int id){
        recursoPersistance.remove(id);
    }
}//class