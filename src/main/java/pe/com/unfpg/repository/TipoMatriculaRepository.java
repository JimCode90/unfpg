package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.TipoMatriculaEntity;

import java.util.List;

public interface TipoMatriculaRepository extends JpaRepository<TipoMatriculaEntity, Long> {

    @Query("select t from TipoMatriculaEntity t where t.estado=true")
    List<TipoMatriculaEntity> findAllCustom();

}
