package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
    @Query("select x from EmpleadoEntity x where x.estado=true")
    List<EmpleadoEntity> findAllCustom();
}
