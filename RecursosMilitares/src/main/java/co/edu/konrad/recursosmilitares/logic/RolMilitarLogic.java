/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.logic;

import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import co.edu.konrad.recursosmilitares.persistence.RolMilitarPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Juan Diego Bernal Pedroza
 */

@Stateless
public class RolMilitarLogic {

    /**
     * Declaracion de la injeccion en la clase RolMilitarPersistence
     */
    @Inject
    RolMilitarPersistence rolMilitarPersistence;

    /**
     * @return marcas Metodo que genera la peticion de una Lista con Objetos de
     * una Entity
     */
    public List<RolMilitarEntity> obtenerRolesMilitares() {
        List<RolMilitarEntity> rolesMilitares = rolMilitarPersistence.findAll();
        return rolesMilitares;
    }

    /**
     * Metodo que genera la peticion de un Objeto tipo Entity identificando por
     * su id
     *
     * @param id
     * @return 
     */
    public RolMilitarEntity obtenerRolMilitar(Long id) {
        RolMilitarEntity rolMilitar = rolMilitarPersistence.find(id);
        if (rolMilitar == null) {
            throw new IllegalArgumentException("el rol militar no existe.");
        }
        return rolMilitar;
    }

    /**
     * Metodo que genera la peticion para crear un Objeto tipo Entity
     * @param rolMilitarEntity
     * @return 
     */
    public RolMilitarEntity crearRolMilitar(RolMilitarEntity rolMilitarEntity) {
        RolMilitarEntity rolMilitarNuevo = rolMilitarPersistence.create(rolMilitarEntity);
        return rolMilitarNuevo;
    }

    /**
     * Metodo que genera la peticion de actualizar una Objeto tipo Entity con
     * otros datos
     * @param id
     * @param rolMilitarActualizar
     * @return 
     */
    public RolMilitarEntity actualizarRolMilitar(Long id, RolMilitarEntity rolMilitarActualizar) {
        RolMilitarEntity rolMilitarActualizado = rolMilitarPersistence.update(rolMilitarActualizar);
        return rolMilitarActualizado;
    }

    /**
     * Metodo que genera la peticion de borrar un Objeto tipo Entity
     *
     */
    public void eliminarRolMilitar(Long id) {
        rolMilitarPersistence.delete(id);
    }
}

