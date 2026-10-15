package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.OrdenPagoEntity;

import java.util.List;

public interface OrdenPagoRepository extends JpaRepository<OrdenPagoEntity, Long> {
    @Query("select o from OrdenPagoEntity o where o.estado=true")
    List<OrdenPagoEntity> findAllCustom();
}
