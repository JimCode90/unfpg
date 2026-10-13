package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.UbicacionEntity;

import java.util.List;

public interface UbicacionRepository extends JpaRepository<UbicacionEntity, Long> {

    @Query("select x from UbicacionEntity x where x.estado=true")
    List<UbicacionEntity> findAllCustom();
}
