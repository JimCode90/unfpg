package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.FacultadEntity;

import java.util.List;

public interface FacultadRepository extends JpaRepository<FacultadEntity, Long> {

    @Query("select f from FacultadEntity f where f.estado=true")
    List<FacultadEntity> findAllCustom();

}
