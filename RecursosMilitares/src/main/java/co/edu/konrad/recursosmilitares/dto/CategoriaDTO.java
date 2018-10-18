/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.CategoriaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite hacer la transferencia a Categoria
 * @author Uriel Rodríguez Vallarta
 */
public class CategoriaDTO {
   
  /**
   * Lista de atributos que hacen referencia al objeto Categoria
   */    
  private int id_categoria;
  private String nom_categoria;
  
  /**
   * Constructor por defecto
   */  
  
    public CategoriaDTO() {
    }
 
    /**
     * Mapeo de Entidad a Objeto
     * @param CategoriaEntity 
     */
    public CategoriaDTO(CategoriaEntity CategoriaEntity) {
        this.id_categoria = CategoriaEntity.getId_categoria();
        this.nom_categoria = CategoriaEntity.getNom_categoria();
    }
    
    /**
     * Mapear de Objeto a Entidad
     * @return 
     */

    public CategoriaEntity toEntity(){
        CategoriaEntity entity = new CategoriaEntity(); 
        entity.setId_categoria(this.id_categoria);
        entity.setNom_categoria(this.nom_categoria);
        
        return entity;
    }
    
    /**
     * Conversor lista entidad a lista de objetos categoria
     * @param categoriaEntitys
     * @return 
     */
    
    public static List<CategoriaDTO> tolistCategoria(List<CategoriaEntity> categoriaEntitys){
        
        List<CategoriaDTO> listaObjectoCategoria = new ArrayList<>();
        for (int i = 0; i <categoriaEntitys.size(); i++) {
            listaObjectoCategoria.add(new CategoriaDTO(categoriaEntitys.get(i)));
        }
        return listaObjectoCategoria;
  
    /**
     * Metodos GET AND SET
     * @return 
     */
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNom_categoria() {
        return nom_categoria;
    }

    public void setNom_categoria(String nom_categoria) {
        this.nom_categoria = nom_categoria;
    }
}//class