package co.edu.konrad.recursosmilitares.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.edu.konrad.recursosmilitares.entities.TipoRecursoEntity;
import co.edu.konrad.recursosmilitares.persistence.TipoRecursoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Logica de negocio recurso
 * @author Uriel Rodríguez Vallarta
 */

@Stateless
public class TipoRecursoLogic {
    
    @Inject 
    private TipoRecursoPersistence tipoRecursoPersistance; 
    
    /**
     * Obtener todos los tipos recursos
     * @return tiposRecursos
     */
    public List<TipoRecursoEntity> getTiposRecursos(){
      List<TipoRecursoEntity> tiposRecursos = tipoRecursoPersistance.findAll();
      return tiposRecursos;
    }
    
    /**
     * Obtener un tipo recurso a través del id
     * @param id
     * @return tipo recurso
     */
    
    public  TipoRecursoEntity getTipoRecurso(int id){
     TipoRecursoEntity tipoRecurso = tipoRecursoPersistance.find(id);
        if (tipoRecurso == null) {
            throw new IllegalArgumentException("El tipo recurso solicitada no existe");
        }
     return tipoRecurso;
    }
    
    /**
     * Crear un nuevo tipo recurso
     * @param tipoRecursoEntity
     * @return 
     */
    
    public TipoRecursoEntity createTipoRecurso(TipoRecursoEntity tipoRecursoEntity){
      tipoRecursoPersistance.create(tipoRecursoEntity); 
      return  tipoRecursoEntity;
    }
    
    /**
     * Actualizar tipo Recurso
     * @param id
     * @param tipoRecursoEntity
     * @return 
     */
    
    public TipoRecursoEntity updateTipoRecurso(int id, TipoRecursoEntity tipoRecursoEntity){
     TipoRecursoEntity tipoRecurso = tipoRecursoPersistance.update(tipoRecursoEntity); 
     return tipoRecurso;
    }
    
    /**
     * metodo para eliminar tipo recurso de la tabla
     * @param id 
     */
    
    public void deleteTipoRecurso(int id){
        tipoRecursoPersistance.remove(id);
    }
}//class