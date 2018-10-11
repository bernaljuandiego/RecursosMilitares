/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.dto;

import co.edu.konrad.recursosmilitares.entities.MilitarEntity;
import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juandiegobernalpedroza
 */
public class MilitarDTO {

    /**
     * Codigo del militar
     */
    private Long idMilitar;

    /**
     * nombre del militar
     */
    private String nombreMilitar;

    /**
     * apellido del militar
     */
    private String apellidoMilitar;

    /**
     * telefono del militar
     */
    private String telefonoMilitar;

    /**
     * correo del militar
     */
    private String correoMilitar;

    /**
     * contraseña del militar
     */
    private String contrasenaMilitar;

    /**
     * avatar del militar
     */
    private String avatarMilitar;

    /**
     * nacimiento del militar
     */
    private String nacimientoMilitar;

    /**
     * rol del militar
     */
    private RolMilitarDTO rolMilitar;

    /**
     * militar superior del militar actual
     */
    private MilitarDTO militarSuperior;

    public MilitarDTO() {
    }

    public MilitarDTO(MilitarEntity militarEntity) {
        this.idMilitar = militarEntity.getIdMilitar();
        this.nombreMilitar = militarEntity.getNombreMilitar();
        this.apellidoMilitar = militarEntity.getApellidoMilitar();
        this.telefonoMilitar = militarEntity.getTelefonoMilitar();
        this.correoMilitar = militarEntity.getCorreoMilitar();
        this.contrasenaMilitar = militarEntity.getContrasenaMilitar();
        this.avatarMilitar = militarEntity.getAvatarMilitar();
        this.nacimientoMilitar = militarEntity.getNacimientoMilitar();
        if (militarEntity.getRolMilitarEntity() != null) {
            RolMilitarEntity rolMilitarEntity = new RolMilitarEntity();
            rolMilitarEntity.setIdRol(militarEntity.getRolMilitarEntity().getIdRol());
            rolMilitarEntity.setNombreRol(militarEntity.getRolMilitarEntity().getNombreRol());
            this.rolMilitar = new RolMilitarDTO(rolMilitarEntity);
        }
        if (militarEntity.getMilitarEntity() != null) {
            MilitarEntity militarSuperiorEntity = new MilitarEntity();
            militarSuperiorEntity.setIdMilitar(militarEntity.getMilitarEntity().getIdMilitar());
            militarSuperiorEntity.setNombreMilitar(militarEntity.getMilitarEntity().getNombreMilitar());
            militarSuperiorEntity.setApellidoMilitar(militarEntity.getMilitarEntity().getApellidoMilitar());
            militarSuperiorEntity.setTelefonoMilitar(militarEntity.getMilitarEntity().getTelefonoMilitar());
            militarSuperiorEntity.setCorreoMilitar(militarEntity.getMilitarEntity().getCorreoMilitar());
            militarSuperiorEntity.setContrasenaMilitar(militarEntity.getMilitarEntity().getContrasenaMilitar());
            militarSuperiorEntity.setAvatarMilitar(militarEntity.getMilitarEntity().getAvatarMilitar());
            militarSuperiorEntity.setNacimientoMilitar(militarEntity.getMilitarEntity().getNacimientoMilitar());
            militarSuperiorEntity.setRolMilitarEntity(militarEntity.getMilitarEntity().getRolMilitarEntity());
            militarSuperiorEntity.setMilitarEntity(militarEntity.getMilitarEntity().getMilitarEntity());
            this.militarSuperior = new MilitarDTO(militarSuperiorEntity);
        }
    }

    public MilitarEntity toEntity() {
        MilitarEntity militarEntity = new MilitarEntity();
        militarEntity.setIdMilitar(this.idMilitar);
        militarEntity.setNombreMilitar(this.nombreMilitar);
        militarEntity.setApellidoMilitar(this.apellidoMilitar);
        militarEntity.setTelefonoMilitar(this.telefonoMilitar);
        militarEntity.setCorreoMilitar(this.correoMilitar);
        militarEntity.setContrasenaMilitar(this.contrasenaMilitar);
        militarEntity.setAvatarMilitar(this.avatarMilitar);
        militarEntity.setNacimientoMilitar(this.nacimientoMilitar);
        if (this.rolMilitar != null) {
            RolMilitarEntity rolMilitarEntity = new RolMilitarEntity();
            rolMilitarEntity.setIdRol(this.rolMilitar.getIdRol());
            rolMilitarEntity.setNombreRol(this.rolMilitar.getNombreRol());
            militarEntity.setRolMilitarEntity(rolMilitarEntity);
        }
        if (this.militarSuperior != null) {
            MilitarEntity militarSuperiorEntity = new MilitarEntity();
            militarSuperiorEntity.setIdMilitar(this.militarSuperior.getIdMilitar());
            militarSuperiorEntity.setNombreMilitar(this.militarSuperior.getNombreMilitar());
            militarSuperiorEntity.setApellidoMilitar(this.militarSuperior.getApellidoMilitar());
            militarSuperiorEntity.setTelefonoMilitar(this.militarSuperior.getTelefonoMilitar());
            militarSuperiorEntity.setCorreoMilitar(this.militarSuperior.getCorreoMilitar());
            militarSuperiorEntity.setContrasenaMilitar(this.militarSuperior.getContrasenaMilitar());
            militarSuperiorEntity.setAvatarMilitar(this.militarSuperior.getAvatarMilitar());
            militarSuperiorEntity.setNacimientoMilitar(this.militarSuperior.getNacimientoMilitar());
            militarSuperiorEntity.setRolMilitarEntity(this.militarSuperior.getRolMilitar().toEntity());
            militarSuperiorEntity.setMilitarEntity(this.militarSuperior.getMilitarSuperior().toEntity());
            militarEntity.setMilitarEntity(militarSuperiorEntity);
        }
        return militarEntity;
    }
    
    /*
    pasar lista de dtos a entities
    */
    public static List<MilitarDTO> toMilitaresList(List<MilitarEntity> militaresList) {
        List<MilitarDTO> listaMilitares = new ArrayList<>();
        for (MilitarEntity militarEntity : militaresList) {
            listaMilitares.add(new MilitarDTO(militarEntity));
        }
        return listaMilitares;
    }

    //todos los getters Y setters

    public Long getIdMilitar() {
        return idMilitar;
    }

    public void setIdMilitar(Long idMilitar) {
        this.idMilitar = idMilitar;
    }

    public String getNombreMilitar() {
        return nombreMilitar;
    }

    public void setNombreMilitar(String nombreMilitar) {
        this.nombreMilitar = nombreMilitar;
    }

    public String getApellidoMilitar() {
        return apellidoMilitar;
    }

    public void setApellidoMilitar(String apellidoMilitar) {
        this.apellidoMilitar = apellidoMilitar;
    }

    public String getTelefonoMilitar() {
        return telefonoMilitar;
    }

    public void setTelefonoMilitar(String telefonoMilitar) {
        this.telefonoMilitar = telefonoMilitar;
    }

    public String getCorreoMilitar() {
        return correoMilitar;
    }

    public void setCorreoMilitar(String correoMilitar) {
        this.correoMilitar = correoMilitar;
    }

    public String getContrasenaMilitar() {
        return contrasenaMilitar;
    }

    public void setContrasenaMilitar(String contrasenaMilitar) {
        this.contrasenaMilitar = contrasenaMilitar;
    }

    public String getAvatarMilitar() {
        return avatarMilitar;
    }

    public void setAvatarMilitar(String avatarMilitar) {
        this.avatarMilitar = avatarMilitar;
    }

    public String getNacimientoMilitar() {
        return nacimientoMilitar;
    }

    public void setNacimientoMilitar(String nacimientoMilitar) {
        this.nacimientoMilitar = nacimientoMilitar;
    }

    public RolMilitarDTO getRolMilitar() {
        return rolMilitar;
    }

    public void setRolMilitar(RolMilitarDTO rolMilitar) {
        this.rolMilitar = rolMilitar;
    }

    public MilitarDTO getMilitarSuperior() {
        return militarSuperior;
    }

    public void setMilitarSuperior(MilitarDTO militarSuperior) {
        this.militarSuperior = militarSuperior;
    }
    
    
}