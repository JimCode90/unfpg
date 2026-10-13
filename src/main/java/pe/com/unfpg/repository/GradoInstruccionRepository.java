package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.GradoInstruccionEntity;

import java.util.List;

public interface GradoInstruccionRepository extends JpaRepository<GradoInstruccionEntity, Long> {

    @Query("select x from GradoInstruccionEntity x where x.estado=true")
    List<GradoInstruccionEntity> findAllCustom();
}
