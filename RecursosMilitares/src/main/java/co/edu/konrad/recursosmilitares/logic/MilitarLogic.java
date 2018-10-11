/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.logic;

import co.edu.konrad.recursosmilitares.entities.MilitarEntity;
import co.edu.konrad.recursosmilitares.persistence.MilitarPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author juandiegobernalpedroza
 */
@Stateless
public class MilitarLogic {
    
    /**
     * Declaracion de la injeccion en la clase MilitarPersistence
     */
    @Inject
    MilitarPersistence militarPersistence;

    /**
     * @return marcas Metodo que genera la peticion de una Lista con Objetos de
     * una Entity
     */
    public List<MilitarEntity> obtenerMilitares() {
        List<MilitarEntity> militares = militarPersistence.findAll();
        return militares;
    }

    /**
     * Metodo que genera la peticion de un Objeto tipo Entity identificando por
     * su id
     *
     * @param id
     * @return 
     */
    public MilitarEntity obtenerMilitar(Long id) {
        MilitarEntity militar = militarPersistence.find(id);
        if (militar == null) {
            throw new IllegalArgumentException("el militar no existe.");
        }
        return militar;
    }

    /**
     * Metodo que genera la peticion para crear un Objeto tipo Entity
     * @param militarEntity
     * @return 
     */
    public MilitarEntity crearMilitar(MilitarEntity militarEntity) {
        MilitarEntity militarNuevo = militarPersistence.create(militarEntity);
        return militarNuevo;
    }

    /**
     * Metodo que genera la peticion de actualizar una Objeto tipo Entity con
     * otros datos
     * @param id
     * @param militarActualizar
     * @return 
     */
    public MilitarEntity actualizarMilitar(Long id, MilitarEntity militarActualizar) {
        MilitarEntity militarActualizado = militarPersistence.update(militarActualizar);
        return militarActualizado;
    }

    /**
     * Metodo que genera la peticion de borrar un Objeto tipo Entity
     *
     */
    public void eliminarMilitar(Long id) {
        militarPersistence.delete(id);
    }
}
