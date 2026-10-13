package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.PlanEstudioEntity;

import java.util.List;

public interface PlanEstudioRepository extends JpaRepository<PlanEstudioEntity, Long> {

    @Query("select p from PlanEstudioEntity p where p.estado=true")
    List<PlanEstudioEntity> findAllCustom();

}
