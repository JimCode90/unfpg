package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.RolLmsEntity;

import java.util.List;

public interface RolLmsRepository extends JpaRepository<RolLmsEntity, Long> {

    @Query("select r from RolLmsEntity r where r.estado=true")
    List<RolLmsEntity> findAllCustom();

}
