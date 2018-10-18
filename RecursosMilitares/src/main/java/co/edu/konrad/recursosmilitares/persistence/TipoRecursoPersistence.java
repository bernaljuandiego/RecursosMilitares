/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.TipoRecursoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase es usada para manejar la transaccionalidad de la entidad Tipo Recurso
 * @author Uriel Rodríguez Vallarta
 */
@Stateless
public class TipoRecursoPersistence {
@PersistenceContext(unitName = "RecursosMilitaresPU")
    private EntityManager entityManager;
    /**
     * Metodo que lista todos los elementos que se encuentran en la tabla Tipo recurso
     * @return lista de tipo programa
     */
    public List<TipoRecursoEntity> findAll(){
        Query todos = entityManager.createQuery("select tr from TipoRecurso tr");
        return todos.getResultList();
    }
    /**
     * Metodo que encuentra un Tipo Recurso por su id
     * @param id
     * @return tipoprogramaEncontrado
     */
    public TipoRecursoEntity find(int id){
        TipoRecursoEntity tiporecursoEncontrado = entityManager.find(TipoRecursoEntity.class, id);
        return tiporecursoEncontrado;
    }
    /**
     * Metodo que nos permite crear un Tipo Recurso
     * @param tiporecursoCrear
     * @return tiporecursoCreado
     */
    public TipoRecursoEntity create(TipoRecursoEntity tiporecursoCrear){
        entityManager.persist(tiporecursoCrear);
        return tiporecursoCrear;
    }
    /**
     * Metodo que nos permite actualizar un Tipo Recurso
     * @param tiporecursoActualizar
     * @return tiporecursoActualizado
     */
    public TipoRecursoEntity update(TipoRecursoEntity tiporecursoActualizar){
        entityManager.merge(tiporecursoActualizar);
        return tiporecursoActualizar;
    }
    /**
     * Metodo que nos permite eliminar un Tipo Recurso
     * @param id 
     */
    public void remove(int id){
        TipoRecursoEntity tiporecursoEliminar = entityManager.find(TipoRecursoEntity.class, id);
        entityManager.remove(tiporecursoEliminar);
    }         
}