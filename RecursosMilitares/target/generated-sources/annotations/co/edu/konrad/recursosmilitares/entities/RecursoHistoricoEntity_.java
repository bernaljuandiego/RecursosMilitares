package co.edu.konrad.recursosmilitares.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-02T13:56:40")
@StaticMetamodel(RecursoHistoricoEntity.class)
public class RecursoHistoricoEntity_ { 

    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> id_recurso_historico;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> fecha_adquisicion;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> estado;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> ubicacion;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> militar_remitente_id;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> militar_receptor_id;
    public static volatile SingularAttribute<RecursoHistoricoEntity, Integer> recurso_id_recurso;

}