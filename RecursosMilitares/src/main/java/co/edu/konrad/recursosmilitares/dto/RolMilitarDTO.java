/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Diego Bernal Pedroza
 */
public class RolMilitarDTO {

    //identificador del tipo de rol
    private Long idRol;
    
    //nombre del tipo de rol
    private String nombreRol;

    //constructor por defecto
    public RolMilitarDTO() {
    }

    /**
     * Conversion de entity a objeto como parametro pasando una entity
     *
     * @param rolMilitarEntity 
     */
    public RolMilitarDTO(RolMilitarEntity rolMilitarEntity) {
        this.idRol = rolMilitarEntity.getIdRol();
        this.nombreRol = rolMilitarEntity.getNombreRol();
    }

    /**
     * Converson de objeto a entidad
     *
     * @return 
     */
    public RolMilitarEntity toEntity() {
        RolMilitarEntity rolMilitarEntity = new RolMilitarEntity();
        rolMilitarEntity.setIdRol(this.idRol);
        rolMilitarEntity.setNombreRol(this.nombreRol);
        return rolMilitarEntity;
    }

    /**
     * Conversion masiva entre RolMilitarEntity a RolMilitarDTO
     *
     * @param rolesMilitares 
     * @return
     */
    public static List<RolMilitarDTO> toRolesMilitaresList(List<RolMilitarEntity> rolesMilitares) {
        List<RolMilitarDTO> listaRolesMilitaresDTO = new ArrayList<>();
        for (int i = 0; i < rolesMilitares.size(); i++) {
            listaRolesMilitaresDTO.add(new RolMilitarDTO(rolesMilitares.get(i)));
        }
        return listaRolesMilitaresDTO;
    }
    
    // getters y setters
    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}