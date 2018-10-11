/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.MilitarDTO;
import co.edu.konrad.recursosmilitares.entities.MilitarEntity;
import co.edu.konrad.recursosmilitares.logic.MilitarLogic;
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
 *
 * @author juandiegobernalpedroza
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/militares")
public class MilitarResource {
    
    @EJB
    private MilitarLogic militarLogic;

    @GET
    public List<MilitarDTO> getMilitares() {
        List<MilitarEntity> militares = militarLogic.obtenerMilitares();
        return MilitarDTO.toMilitaresList(militares);
    }

    @GET
    @Path("{id: \\d+}")
    public MilitarDTO getMilitar(@PathParam("id") Long id) {
        MilitarEntity militar = militarLogic.obtenerMilitar(id);
        if (militar == null) {
            throw new RuntimeException("El militar solicitado no existe!");
        }
        return new MilitarDTO(militar);
    }

    @POST
    public MilitarDTO createMilitar(MilitarDTO militarDTO) {
        return new MilitarDTO(militarLogic.crearMilitar(militarDTO.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public MilitarDTO updateMilitar(@PathParam("id") Long id, MilitarDTO militarDTO) {
        MilitarEntity militar = militarLogic.obtenerMilitar(id);
        if (militar == null) {
            throw new RuntimeException("El militar a actualizar no existe!");
        }
        return new MilitarDTO(militarLogic.actualizarMilitar(id, militarDTO.toEntity()));
    }

    @DELETE
    @Path("{id: \\d+}")
    public void deleteMilitar(@PathParam("id") Long id) {
        MilitarEntity militar = militarLogic.obtenerMilitar(id);
        if (militar == null) {
            throw new RuntimeException("El militar a eliminar no existe!");
        }
        militarLogic.eliminarMilitar(id);
    }
}
