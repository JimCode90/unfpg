package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EjemplarLibroEntity;

import java.util.List;

public interface EjemplarLibroRepository extends JpaRepository<EjemplarLibroEntity, Long> {
    @Query("select e from EjemplarLibroEntity e where e.estado=true")
    List<EjemplarLibroEntity> findAllCustom();
}
