package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.TipoCalificacionEntity;

import java.util.List;

public interface TipoCalificacionRepository extends JpaRepository<TipoCalificacionEntity, Long> {

    @Query("select t from TipoCalificacionEntity t where t.estado=true")
    List<TipoCalificacionEntity> findAllCustom();

}
