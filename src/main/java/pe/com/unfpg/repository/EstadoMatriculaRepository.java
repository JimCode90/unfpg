package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EstadoMatriculaEntity;

import java.util.List;

public interface EstadoMatriculaRepository extends JpaRepository<EstadoMatriculaEntity, Long> {

    @Query("select e from EstadoMatriculaEntity e where e.estado=true")
    List<EstadoMatriculaEntity> findAllCustom();

}
