/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.RecursoHistoricoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase es usada para manejar la transaccionalidad de la entidad recurso historico
 * @author Uriel Rodríguez Vallarta
 */
@Stateless
public class RecursoHistoricoPersistence {
@PersistenceContext(unitName = "RecursosMilitaresPU")
    private EntityManager entityManager;
    /**
     * Metodo que lista todos los elementos que se encuentran en la tabla recurso historico
     * @return lista de recurso historico
     */
    public List<RecursoHistoricoEntity> findAll(){
        Query todos = entityManager.createQuery("select rh from RecursoHistorico rh");
        return todos.getResultList();
    }
    /**
     * Metodo que encuentra un recurso historico por su id
     * @param id
     * @return recursohistoricoEncontrado
     */
    public RecursoHistoricoEntity find(int id){
        RecursoHistoricoEntity recursohistoricoEncontrado = entityManager.find(RecursoHistoricoEntity.class, id);
        return recursohistoricoEncontrado;
    }
    /**
     * Metodo que nos permite crear un Recurso historico
     * @param recursohistoricoCrear
     * @return recursohistoricoCreado
     */
    public RecursoHistoricoEntity create(RecursoHistoricoEntity recursohistoricoCrear){
        entityManager.persist(recursohistoricoCrear);
        return recursohistoricoCrear;
    }
    /**
     * Metodo que nos permite actualizar un recurso historico
     * @param recursohistoricoActualizar
     * @return recursohistoricoActualizado
     */
    public RecursoHistoricoEntity update(RecursoHistoricoEntity recursohistoricoActualizar){
        entityManager.merge(recursohistoricoActualizar);
        return recursohistoricoActualizar;
    }
    /**
     * Metodo que nos permite eliminar un recurso historico
     * @param id 
     */
    public void remove(int id){
        RecursoHistoricoEntity recursohistoricoEliminar = entityManager.find(RecursoHistoricoEntity.class, id);
        entityManager.remove(recursohistoricoEliminar);
    }         
}