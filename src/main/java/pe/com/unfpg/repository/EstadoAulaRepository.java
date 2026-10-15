package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EstadoAulaEntity;

import java.util.List;

public interface EstadoAulaRepository extends JpaRepository<EstadoAulaEntity, Long> {

    @Query("select x from EstadoAulaEntity x where x.estado=true")
    List<EstadoAulaEntity> findAllCustom();
}
