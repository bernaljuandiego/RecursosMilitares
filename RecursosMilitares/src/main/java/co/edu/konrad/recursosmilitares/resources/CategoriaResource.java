/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.CategoriaDTO;
import co.edu.konrad.recursosmilitares.entities.CategoriaEntity;
import co.edu.konrad.recursosmilitares.logic.CategoriaLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Servicio REST categoria
 * @author Uriel Rodríguez Vallarta
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/categorias")
public class CategoriaResource {
    
    @EJB
    private CategoriaLogic categoriaLogic; 
    
    /**
     * Método REST para obtener todos las categorias
     * @return 
     */
    
    @GET
    public List<CategoriaDTO> getListaCategoria(){
        List<CategoriaEntity> categorias = categoriaLogic.getCategorias(); 
        return CategoriaDTO.tolistCategoria(categorias);
    }
    
    /**
     * Método REST para obtener una categoria a través del id
     * @param id
     * @return 
     */
    
    @GET 
    @Path("{id_categoria: \\d+}")
    public CategoriaDTO getCategoria(@PathParam("id_categoria") int id){
        CategoriaEntity categoria = categoriaLogic.getCategoria(id); 
        if (categoria == null) {
            throw new RuntimeException("La categoria no existe");
        }
        
        return new CategoriaDTO(categoria);
    }
    
    /**
     * Método REST para crear una categoria
     * @param categoriaCrear
     * @return 
     */
    
    @POST 
    public CategoriaDTO createCategoria(CategoriaDTO categoriaCrear){
        return new CategoriaDTO(categoriaLogic.createCategoria(categoriaCrear.toEntity()));
    }
    
    /**
     * Método REST para actualizar una categoria
     * @param id
     * @param categoriaActualizar
     * @return 
     */
    
    @PUT 
    @Path("{id_categoria: \\d+}")
    public CategoriaDTO updateCategoria (@PathParam("id_categoria") int id,CategoriaDTO categoriaActualizar ){
        CategoriaEntity entity = categoriaLogic.getCategoria(id);
        
        if (entity == null) {
            
            throw new RuntimeException("La categoria no existe");
        }
        
        return new CategoriaDTO(categoriaLogic.updateCategoria(id, categoriaActualizar.toEntity()));
    }
    
    /**
     * Método REST para eliminar una categoria
     * @param id 
     */
    @DELETE
    @Path("{id_categoria: \\d+}")
    public void deleteCategoria(@PathParam("id_categoria") int id){
        CategoriaEntity categoria = categoriaLogic.getCategoria(id);
        if (categoria == null) {
            throw new RuntimeException("La categoria no existe");
        }
        categoriaLogic.deleteCategoria(id);
    }
}//class

