package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.RolEntity;

import java.util.List;

public interface RolRepository extends JpaRepository<RolEntity, Long> {

    @Query("select x from RolEntity x where x.estado=true")
    List<RolEntity> findAllCustom();
}
