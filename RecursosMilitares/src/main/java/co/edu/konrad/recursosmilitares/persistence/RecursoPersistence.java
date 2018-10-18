/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.RecursoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase es usada para manejar la transaccionalidad de la entidad Recurso
 * @author Uriel Rodríguez Vallarta
 */
@Stateless
public class RecursoPersistence {
@PersistenceContext(unitName = "RecursosMilitaresPU")
    private EntityManager entityManager;
    /**
     * Metodo que lista todos los elementos que se encuentran en la tabla Recurso
     * @return lista de recursos
     */
    public List<RecursoEntity> findAll(){
        Query todos = entityManager.createQuery("select r from Recurso r");
        return todos.getResultList();
    }
    /**
     * Metodo que encuentra un recurso por su id
     * @param id
     * @return recursoEncontrado
     */
    public RecursoEntity find(int id){
        RecursoEntity recursoEncontrado = entityManager.find(RecursoEntity.class, id);
        return recursoEncontrado;
    }
    /**
     * Metodo que nos permite crear un Recurso
     * @param recursoCrear
     * @return recursoCreado
     */
    public RecursoEntity create(RecursoEntity recursoCrear){
        entityManager.persist(recursoCrear);
        return recursoCrear;
    }
    /**
     * Metodo que nos permite actualizar un Recurso
     * @param recursoActualizar
     * @return recursoActualizado
     */
    public RecursoEntity update(RecursoEntity recursoActualizar){
        entityManager.merge(recursoActualizar);
        return recursoActualizar;
    }
    /**
     * Metodo que nos permite eliminar un Recurso
     * @param id 
     */
    public void remove(int id){
        RecursoEntity recursoEliminar = entityManager.find(RecursoEntity.class, id);
        entityManager.remove(recursoEliminar);
    }         
}