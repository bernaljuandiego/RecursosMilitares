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

/**
 *
 * @author Juan Diego Bernal Pedroza
 */
@Entity(name = "rol_militar")
public class RolMilitarEntity implements Serializable {
    
    //serial de la version de la entity
    private final static long serialVersionUID = 1L;

    public RolMilitarEntity() {
    }

    //Codigo del rol - llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_rol", nullable = false)
    private Long idRol;

    //Nombre del rol del militar
    @Column(name = "nom_rol", nullable = false)
    private String nombreRol;

    // getters y setters de los atributos del entity
 
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
