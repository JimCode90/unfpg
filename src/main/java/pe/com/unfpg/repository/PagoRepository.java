package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.PagoEntity;

import java.util.List;

public interface PagoRepository extends JpaRepository<PagoEntity, Long> {
    @Query("select p from PagoEntity p where p.estado=true")
    List<PagoEntity> findAllCustom();
}
