package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.AreaEmpleoEntity;

import java.util.List;

public interface AreaEmpleoRepository extends JpaRepository<AreaEmpleoEntity, Long> {

    @Query("select x from AreaEmpleoEntity x where x.estado=true")
    List<AreaEmpleoEntity> findAllCustom();
}
