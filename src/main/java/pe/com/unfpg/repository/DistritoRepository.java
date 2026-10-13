package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.DistritoEntity;

import java.util.List;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {

    //utilizamos el JpaRepository por defecto se configura:
    //mostrar, buscar por código, registrar, actualizar y eliminar

    //agregamos una Query personalizada
    //Consulta MySQL: select * from distrito where estdis=1
    //creamos un query personalizado
    @Query("select d from DistritoEntity d where d.estado=true")
    List<DistritoEntity> findAllCustom();


}
