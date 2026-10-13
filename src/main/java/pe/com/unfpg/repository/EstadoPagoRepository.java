package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EstadoPagoEntity;

import java.util.List;

public interface EstadoPagoRepository extends JpaRepository<EstadoPagoEntity, Long> {

    @Query("select e from EstadoPagoEntity e where e.estado=true")
    List<EstadoPagoEntity> findAllCustom();

}
