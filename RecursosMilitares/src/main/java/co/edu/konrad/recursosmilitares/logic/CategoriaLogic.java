package co.edu.konrad.recursosmilitares.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.edu.konrad.recursosmilitares.entities.CategoriaEntity;
import co.edu.konrad.recursosmilitares.persistence.CategoriaPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Logica de negocio categoria
 * @author Uriel Rodríguez Vallarta
 */

@Stateless
public class CategoriaLogic {
    
    @Inject 
    private CategoriaPersistence categoriaPersistance; 
    
    /**
     * Obtener todos las categorias
     * @return categorias
     */
    public List<CategoriaEntity> getCategorias(){
      List<CategoriaEntity> categorias = categoriaPersistance.findAll();
      return categorias;
    }
    
    /**
     * Obtener una categoria a través del id
     * @param id
     * @return categoria
     */
    
    public  CategoriaEntity getCategoria(int id){
     CategoriaEntity categoria = categoriaPersistance.find(id);
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria solicitada no existe");
        }
     return categoria;
    }
    
    /**
     * Crear una nueva categoria
     * @param categoriaEntity
     * @return 
     */
    
    public CategoriaEntity createCategoria(CategoriaEntity categoriaEntity){
      categoriaPersistance.create(categoriaEntity); 
      return  categoriaEntity;
    }
    
    /**
     * Actualizar categoria
     * @param id
     * @param categoriaEntity
     * @return 
     */
    
    public CategoriaEntity updateCategoria(int id, CategoriaEntity categoriaEntity){
     CategoriaEntity categoria = categoriaPersistance.update(categoriaEntity); 
     return categoria;
    }
    
    /**
     * metodo para eliminar categoria de la tabla
     * @param id 
     */
    
    public void deleteCategoria(int id){
        categoriaPersistance.remove(id);
    }
}//class