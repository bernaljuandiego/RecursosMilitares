/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.recursosmilitares.resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Clase que registra el inventario de todos los recursos
 * @author Juan Diego Bernal Pedroza y Uriel Rodríguez Vallarta
 */
@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.konrad.recursosmilitares.resources.CategoriaResource.class);
        resources.add(co.edu.konrad.recursosmilitares.resources.RecursoHistoricoResource.class);
        resources.add(co.edu.konrad.recursosmilitares.resources.RecursoResource.class);
        resources.add(co.edu.konrad.recursosmilitares.resources.RolMilitarResource.class);
        resources.add(co.edu.konrad.recursosmilitares.resources.TipoRecursoResource.class);
    }   
}
