/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Juan Diego Bernal Pedroza
 */
@Stateless
public class RolMilitarPersistence {
    
    //se asigna la unidad de persistencia y se declara el entity manager
    @PersistenceContext(unitName = "RecursosMilitaresPU")
    protected EntityManager em;
    
    /**
     * Obtener la lista con los datos de la tabla Rol_Militar
     * @return Lista de datos de la tabla 
     */
    public List<RolMilitarEntity> findAll(){
        Query todos = em.createQuery("select e from rol_militar e");
        return todos.getResultList();
    }
    
    /**
     * Encontrar una tupla especifica de la tabla Rol_Militar
     * @param id que se desea buscar
     * @return RolMilitarEntity
     */
    public RolMilitarEntity find(Long id){
        RolMilitarEntity rolMilitar = em.find(RolMilitarEntity.class, id);
        return rolMilitar;
    }
    
    /**
     * Creacion de un nuevo Rol_Militar
     * @param rolMilitarEntity
     * @return nuevo Rol_Militar creado
     */
    public RolMilitarEntity create(RolMilitarEntity rolMilitarEntity){
        em.persist(rolMilitarEntity);
        return rolMilitarEntity;
    }
    
    /**
     * Actualizacion de una tupla de la tabla RolMilitar
     * @param rolMilitarEntity 
     * @return RolMilitar actualizado
     */
    public RolMilitarEntity update(RolMilitarEntity rolMilitarEntity){
        return em.merge(rolMilitarEntity);
    }
    
    /**
     * Elimina una tupla RolMilitar de la tabla
     * @param id 
     */
    public void delete(Long id){
        RolMilitarEntity rolMilitar = em.find(RolMilitarEntity.class, id);
        em.remove(rolMilitar);
    }
}
