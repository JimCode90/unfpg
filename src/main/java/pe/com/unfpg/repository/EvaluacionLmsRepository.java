package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EvaluacionLmsEntity;

import java.util.List;

public interface EvaluacionLmsRepository extends JpaRepository<EvaluacionLmsEntity, Long> {
    @Query("select e from EvaluacionLmsEntity e where e.estado=true")
    List<EvaluacionLmsEntity> findAllCustom();
}
