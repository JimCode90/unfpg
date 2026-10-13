package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.TipoAulaEntity;

import java.util.List;

public interface TipoAulaRepository extends JpaRepository<TipoAulaEntity, Long> {

    @Query("select x from TipoAulaEntity x where x.estado=true")
    List<TipoAulaEntity> findAllCustom();
}
