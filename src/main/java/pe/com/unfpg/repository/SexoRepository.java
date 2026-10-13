package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.SexoEntity;

import java.util.List;

public interface SexoRepository extends JpaRepository<SexoEntity, Long> {

    @Query("select x from SexoEntity x where x.estado=true")
    List<SexoEntity> findAllCustom();
}
