/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.RecursoHistoricoDTO;
import co.edu.konrad.recursosmilitares.entities.RecursoHistoricoEntity;
import co.edu.konrad.recursosmilitares.logic.RecursoHistoricoLogic;
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
@Path("/recursosHistoricos")
public class RecursoHistoricoResource {
    
    @EJB
    private RecursoHistoricoLogic recursoHistoricoLogic; 
    
    /**
     * Método REST para obtener todos los recursos historicos
     * @return 
     */
    
    @GET
    public List<RecursoHistoricoDTO> getListaRecursoHistorico(){
        List<RecursoHistoricoEntity> recursosHistoricos = recursoHistoricoLogic.getRecursosHistoricos(); 
        return RecursoHistoricoDTO.tolistRecursoHistorico(recursosHistoricos);
    }
    
    /**
     * Método REST para obtener un recurso historico a través del id
     * @param id
     * @return 
     */
    
    @GET 
    @Path("{id_recurso_historico: \\d+}")
    public RecursoHistoricoDTO getRecursoHistorico(@PathParam("id_recurso_historico") int id){
        RecursoHistoricoEntity recursoHistorico = recursoHistoricoLogic.getRecursoHistorico(id); 
        if (recursoHistorico == null) {
            throw new RuntimeException("El recurso historico no existe");
        }
        
        return new RecursoHistoricoDTO(recursoHistorico);
    }
    
    /**
     * Método REST para crear un recurso historico
     * @param recursoHistoricoCrear
     * @return 
     */
    
    @POST 
    public RecursoHistoricoDTO createRecursoHistorico(RecursoHistoricoDTO recursoHistoricoCrear){
        return new RecursoHistoricoDTO(recursoHistoricoLogic.createRecursoHistorico(recursoHistoricoCrear.toEntity()));
    }
    
    /**
     * Método REST para actualizar un recurso historico
     * @param id
     * @param recursoHistoricoActualizar
     * @return 
     */
    
    @PUT 
    @Path("{id_recurso_historico: \\d+}")
    public RecursoHistoricoDTO updateRecursoHistorico (@PathParam("id_recurso_historico") int id,RecursoHistoricoDTO recursoHistoricoActualizar ){
        RecursoHistoricoEntity entity = recursoHistoricoLogic.getRecursoHistorico(id);
        
        if (entity == null) {
            
            throw new RuntimeException("El recurso historico no existe");
        }
        
        return new RecursoHistoricoDTO(recursoHistoricoLogic.updateRecursoHistorico(id, recursoHistoricoActualizar.toEntity()));
    }
    
    /**
     * Método REST para eliminar un recurso historico
     * @param id 
     */
    @DELETE
    @Path("{id_recurso_historico: \\d+}")
    public void deleteRecursoHistorico(@PathParam("id_recurso_historico") int id){
        RecursoHistoricoEntity recursoHistorico = recursoHistoricoLogic.getRecursoHistorico(id);
        if (recursoHistorico == null) {
            throw new RuntimeException("El recurso historico no existe");
        }
        recursoHistoricoLogic.deleteRecursoHistorico(id);
    }
}//class

