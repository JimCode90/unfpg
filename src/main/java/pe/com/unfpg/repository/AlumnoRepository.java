package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.AlumnoEntity;

import java.util.List;

public interface AlumnoRepository  extends JpaRepository<AlumnoEntity, Long> {
    @Query("select a from AlumnoEntity a where a.estado=true")
    List<AlumnoEntity> findAllCustom();
}
