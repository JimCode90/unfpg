package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.PeriodoAcademicoEntity;

import java.util.List;

public interface PeriodoAcademicoRepository extends JpaRepository<PeriodoAcademicoEntity, Long> {

    @Query("select p from PeriodoAcademicoEntity p where p.estado=true")
    List<PeriodoAcademicoEntity> findAllCustom();

}
