/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.persistence;

import co.edu.konrad.recursosmilitares.entities.CategoriaEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase es usada para manejar la transaccionalidad de la entidad Categoria
 * @author Uriel Rodríguez Vallarta
 */
@Stateless
public class CategoriaPersistence {
@PersistenceContext(unitName = "RecursoMilitarPU")
    private EntityManager entityManager;
    /**
     * Metodo que lista todos los elementos que se encuentran en la tabla Categoria
     * @return lista de categoria
     */
    public List<CategoriaEntity> findAll(){
        Query todos = entityManager.createQuery("select c from CategoriaEntity c");
        return todos.getResultList();
    }
    /**
     * Metodo que encuentra una categoria por su id
     * @param id
     * @return categoriaEncontrado
     */
    public CategoriaEntity find(int id){
        CategoriaEntity categoriaEncontrado = entityManager.find(CategoriaEntity.class, id);
        return categoriaEncontrado;
    }
    /**
     * Metodo que nos permite crear una categoria
     * @param categoriaCrear
     * @return categoriaCreado
     */
    public CategoriaEntity create(CategoriaEntity categoriaCrear){
        entityManager.persist(categoriaCrear);
        return categoriaCrear;
    }
    /**
     * Metodo que nos permite actualizar una categoria
     * @param categoriaActualizar
     * @return categoriaActualizado
     */
    public CategoriaEntity update(CategoriaEntity categoriaActualizar){
        entityManager.merge(categoriaActualizar);
        return categoriaActualizar;
    }
    /**
     * Metodo que nos permite eliminar una Categoria
     * @param id 
     */
    public void remove(int id){
        CategoriaEntity categoriaEliminar = entityManager.find(CategoriaEntity.class, id);
        entityManager.remove(categoriaEliminar);
    }         
}