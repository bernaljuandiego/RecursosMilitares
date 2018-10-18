/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.TipoRecursoDTO;
import co.edu.konrad.recursosmilitares.entities.TipoRecursoEntity;
import co.edu.konrad.recursosmilitares.logic.TipoRecursoLogic;
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
 * Servicio REST tipo recurso
 * @author Uriel Rodríguez Vallarta
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/tiposRecursos")
public class TipoRecursoResource {
    
    @EJB
    private TipoRecursoLogic tipoRecursoLogic; 
    
    /**
     * Método REST para obtener todos los tipos de recursos
     * @return 
     */
    
    @GET
    public List<TipoRecursoDTO> getListaTipoRecurso(){
        List<TipoRecursoEntity> tiposRecursos = tipoRecursoLogic.getTiposRecursos(); 
        return TipoRecursoDTO.tolistTipoRecurso(tiposRecursos);
    }
    
    /**
     * Método REST para obtener un tipo recurso a través del id
     * @param id
     * @return 
     */
    
    @GET 
    @Path("{id_tipo_recurso: \\d+}")
    public TipoRecursoDTO getTipoRecurso(@PathParam("id_tipo_recurso") int id){
        TipoRecursoEntity tipoRecurso = tipoRecursoLogic.getTipoRecurso(id); 
        if (tipoRecurso == null) {
            throw new RuntimeException("El tipo recurso no existe");
        }
        
        return new TipoRecursoDTO(tipoRecurso);
    }
    
    /**
     * Método REST para crear un tipo recurso
     * @param tipoRecursoCrear
     * @return 
     */
    
    @POST 
    public TipoRecursoDTO createTipoRecurso(TipoRecursoDTO tipoRecursoCrear){
        return new TipoRecursoDTO(tipoRecursoLogic.createTipoRecurso(tipoRecursoCrear.toEntity()));
    }
    
    /**
     * Método REST para actualizar un tipo recurso
     * @param id
     * @param tipoRecursoActualizar
     * @return 
     */
    
    @PUT 
    @Path("{id_tipo_recurso: \\d+}")
    public TipoRecursoDTO updateTipoRecurso (@PathParam("id_tipo_recurso") int id,TipoRecursoDTO tipoRecursoActualizar ){
        TipoRecursoEntity entity = tipoRecursoLogic.getTipoRecurso(id);
        
        if (entity == null) {
            
            throw new RuntimeException("El tipo recurso no existe");
        }
        
        return new TipoRecursoDTO(tipoRecursoLogic.updateTipoRecurso(id, tipoRecursoActualizar.toEntity()));
    }
    
    /**
     * Método REST para eliminar un tipo recurso
     * @param id 
     */
    @DELETE
    @Path("{id_tipo_recurso: \\d+}")
    public void deleteTipoRecurso(@PathParam("id_tipo_recurso") int id){
        TipoRecursoEntity tipoRecurso = tipoRecursoLogic.getTipoRecurso(id);
        if (tipoRecurso == null) {
            throw new RuntimeException("El tipo recurso no existe");
        }
        tipoRecursoLogic.deleteTipoRecurso(id);
    }
}//class

