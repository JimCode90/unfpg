package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.DocenteEntity;

import java.util.List;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {
    @Query("select x from DocenteEntity x where x.estado=true")
    List<DocenteEntity> findAllCustom();
}
