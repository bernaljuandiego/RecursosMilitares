/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.MilitarEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author juandiegobernalpedroza
 */
@Stateless
public class MilitarPersistence {
    //se asigna la unidad de persistencia y se declara el entity manager
    @PersistenceContext(unitName = "RecursosMilitaresPU")
    protected EntityManager em;
    
    /**
     * Obtener la lista con los datos de la tabla Militar
     * @return Lista de datos de la tabla 
     */
    public List<MilitarEntity> findAll(){
        Query todos = em.createQuery("select e from militar e");
        return todos.getResultList();
    }
    
    /**
     * Encontrar una tupla especifica de la tabla Militar
     * @param id que se desea buscar
     * @return MilitarEntity
     */
    public MilitarEntity find(Long id){
        MilitarEntity Militar = em.find(MilitarEntity.class, id);
        return Militar;
    }
    
    /**
     * Creacion de un nuevo Militar
     * @param MilitarEntity
     * @return nuevo Militar creado
     */
    public MilitarEntity create(MilitarEntity MilitarEntity){
        em.persist(MilitarEntity);
        return MilitarEntity;
    }
    
    /**
     * Actualizacion de una tupla de la tabla Militar
     * @param MilitarEntity 
     * @return Militar actualizado
     */
    public MilitarEntity update(MilitarEntity MilitarEntity){
        return em.merge(MilitarEntity);
    }
    
    /**
     * Elimina una tupla Militar de la tabla
     * @param id 
     */
    public void delete(Long id){
        MilitarEntity Militar = em.find(MilitarEntity.class, id);
        em.remove(Militar);
    }
}
