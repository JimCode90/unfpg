package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EstadoCivilEntity;

import java.util.List;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivilEntity, Long> {

    @Query("select x from EstadoCivilEntity x where x.estado=true")
    List<EstadoCivilEntity> findAllCustom();
}
