package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.BloqueEntity;

import java.util.List;

public interface BloqueRepository extends JpaRepository<BloqueEntity, Long> {

    @Query("select x from BloqueEntity x where x.estado=true")
    List<BloqueEntity> findAllCustom();
}
