/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author juandiegobernalpedroza
 */
@Entity(name = "militar")
public class MilitarEntity implements Serializable{

    private final static long serialVersionUID = 1L;
      
    public MilitarEntity() {
    }
    
    /**
     * Codigo del militar
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_militar", nullable = false)
    private Long idMilitar;

    /**
     * nombre del militar 
     */
    @Column(name = "nombre_militar")
    private String nombreMilitar;
    
    /**
     * apellido del militar 
     */
    @Column(name = "apellido_militar")
    private String apellidoMilitar;
    
    /**
     * telefono del militar 
     */
    @Column(name = "telefono_militar")
    private String telefonoMilitar;
    
    /**
     * correo del  militar 
     */
    @Column(name = "correo_militar")
    private String correoMilitar;
    
    /**
     * contraseña del militar 
     */
    @Column(name = "contrasena_militar")
    private String contrasenaMilitar;
      
    /**
     * avatar del militar 
     */
    @Column(name = "avatar_militar")
    private String avatarMilitar;
    
    /**
     * nacimiento del militar 
     */
    @Column(name = "nacimiento_militar")
    private String nacimientoMilitar;
    
    
    /**
     * Atributo que controla la relación con la Tabla Rol Militar.
     */
    @ManyToOne
    @JoinColumn(name = "cod_rol")
    private RolMilitarEntity rolMilitarEntity;
    
    /**
     * Atributo que controla la relación con la Tabla Militar.
     */
    @ManyToOne
    @JoinColumn(name = "id_militar_superior")
    private MilitarEntity militarEntity;    

    //todos los getters y setters
    
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

    public RolMilitarEntity getRolMilitarEntity() {
        return rolMilitarEntity;
    }

    public void setRolMilitarEntity(RolMilitarEntity rolMilitarEntity) {
        this.rolMilitarEntity = rolMilitarEntity;
    }

    public MilitarEntity getMilitarEntity() {
        return militarEntity;
    }

    public void setMilitarEntity(MilitarEntity militarEntity) {
        this.militarEntity = militarEntity;
    }
}