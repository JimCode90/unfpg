package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.MatriculaEntity;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query("select m from MatriculaEntity m where m.estado=true")
    List<MatriculaEntity> findAllCustom();
}
