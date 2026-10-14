package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.DetalleMatriculaEntity;

import java.util.List;

public interface DetalleMatriculaRepository extends JpaRepository<DetalleMatriculaEntity, Long> {
    @Query("select d from DetalleMatriculaEntity d where d.estado=true")
    List<DetalleMatriculaEntity> findAllCustom();
}
