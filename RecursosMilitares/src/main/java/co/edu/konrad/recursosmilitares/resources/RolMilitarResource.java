/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import co.edu.konrad.recursosmilitares.dto.RolMilitarDTO;
import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import co.edu.konrad.recursosmilitares.logic.RolMilitarLogic;
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
 * @author Juan Diego Bernal Pedroza
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/roles_militares")
public class RolMilitarResource {

    @EJB
    private RolMilitarLogic rolMilitarLogic;

    @GET
    public List<RolMilitarDTO> getRolesMilitares() {
        List<RolMilitarEntity> rolesMilitares = rolMilitarLogic.obtenerRolesMilitares();
        return RolMilitarDTO.toRolesMilitaresList(rolesMilitares);
    }

    @GET
    @Path("{id: \\d+}")
    public RolMilitarDTO getRolMilitar(@PathParam("id") Long id) {
        RolMilitarEntity rolMilitar = rolMilitarLogic.obtenerRolMilitar(id);
        if (rolMilitar == null) {
            throw new RuntimeException("El rol militar solicitado no existe!");
        }
        return new RolMilitarDTO(rolMilitar);
    }

    @POST
    public RolMilitarDTO createRolMilitar(RolMilitarDTO rolMilitarDTO) {
        return new RolMilitarDTO(rolMilitarLogic.crearRolMilitar(rolMilitarDTO.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public RolMilitarDTO updateRolMilitar(@PathParam("id") Long id, RolMilitarDTO rolMilitarDTO) {
        RolMilitarEntity rolMilitar = rolMilitarLogic.obtenerRolMilitar(id);
        if (rolMilitar == null) {
            throw new RuntimeException("El rol militar a actualizar no existe!");
        }
        return new RolMilitarDTO(rolMilitarLogic.actualizarRolMilitar(id, rolMilitarDTO.toEntity()));
    }

    @DELETE
    @Path("{id: \\d+}")
    public void deleteRolMilitar(@PathParam("id") Long id) {
        RolMilitarEntity rolMilitar = rolMilitarLogic.obtenerRolMilitar(id);
        if (rolMilitar == null) {
            throw new RuntimeException("El rol militar a eliminar no existe!");
        }
        rolMilitarLogic.eliminarRolMilitar(id);
    }
}