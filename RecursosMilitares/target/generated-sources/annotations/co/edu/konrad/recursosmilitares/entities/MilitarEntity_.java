package co.edu.konrad.recursosmilitares.entities;

import co.edu.konrad.recursosmilitares.entities.MilitarEntity;
import co.edu.konrad.recursosmilitares.entities.RolMilitarEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-09T13:51:45")
@StaticMetamodel(MilitarEntity.class)
public class MilitarEntity_ { 

    public static volatile SingularAttribute<MilitarEntity, MilitarEntity> militarEntity;
    public static volatile SingularAttribute<MilitarEntity, String> nombreMilitar;
    public static volatile SingularAttribute<MilitarEntity, String> telefonoMilitar;
    public static volatile SingularAttribute<MilitarEntity, Long> idMilitar;
    public static volatile SingularAttribute<MilitarEntity, String> correoMilitar;
    public static volatile SingularAttribute<MilitarEntity, RolMilitarEntity> rolMilitarEntity;
    public static volatile SingularAttribute<MilitarEntity, String> apellidoMilitar;
    public static volatile SingularAttribute<MilitarEntity, String> contrasenaMilitar;
    public static volatile SingularAttribute<MilitarEntity, String> avatarMilitar;
    public static volatile SingularAttribute<MilitarEntity, String> nacimientoMilitar;

}