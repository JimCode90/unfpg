package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EditorialEntity;

import java.util.List;

public interface EditorialRepository extends JpaRepository<EditorialEntity, Long> {

    @Query("select e from EditorialEntity e where e.estado=true")
    List<EditorialEntity> findAllCustom();

}
