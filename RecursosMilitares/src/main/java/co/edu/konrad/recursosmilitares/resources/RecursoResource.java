/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.RecursoDTO;
import co.edu.konrad.recursosmilitares.entities.RecursoEntity;
import co.edu.konrad.recursosmilitares.logic.RecursoLogic;
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
 * Servicio REST recurso
 * @author Uriel Rodríguez Vallarta
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/recursos")
public class RecursoResource {
    
    @EJB
    private RecursoLogic recursoLogic; 
    
    /**
     * Método REST para obtener todos los recursos
     * @return 
     */
    
    @GET
    public List<RecursoDTO> getListaRecurso(){
        List<RecursoEntity> recursos = recursoLogic.getRecursos(); 
        return RecursoDTO.tolistRecurso(recursos);
    }
    
    /**
     * Método REST para obtener un recurso a través del id
     * @param id
     * @return 
     */
    
    @GET 
    @Path("{id_recurso: \\d+}")
    public RecursoDTO getRecurso(@PathParam("id_recurso") int id){
        RecursoEntity recurso = recursoLogic.getRecurso(id); 
        if (recurso == null) {
            throw new RuntimeException("El recurso no existe");
        }
        
        return new RecursoDTO(recurso);
    }
    
    /**
     * Método REST para crear un recurso
     * @param recursoCrear
     * @return 
     */
    
    @POST 
    public RecursoDTO createRecurso(RecursoDTO recursoCrear){
        return new RecursoDTO(recursoLogic.createRecurso(recursoCrear.toEntity()));
    }
    
    /**
     * Método REST para actualizar un recurso
     * @param id
     * @param recursoActualizar
     * @return 
     */
    
    @PUT 
    @Path("{id_recurso: \\d+}")
    public RecursoDTO updateRecurso (@PathParam("id_recurso") int id,RecursoDTO recursoActualizar ){
        RecursoEntity entity = recursoLogic.getRecurso(id);
        
        if (entity == null) {
            
            throw new RuntimeException("El recurso no existe");
        }
        
        return new RecursoDTO(recursoLogic.updateRecurso(id, recursoActualizar.toEntity()));
    }
    
    /**
     * Método REST para eliminar un recurso
     * @param id 
     */
    @DELETE
    @Path("{id_recurso: \\d+}")
    public void deleteRecurso(@PathParam("id_recurso") int id){
        RecursoEntity recurso = recursoLogic.getRecurso(id);
        if (recurso == null) {
            throw new RuntimeException("El recurso no existe");
        }
        recursoLogic.deleteRecurso(id);
    }
}//class

