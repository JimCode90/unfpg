package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.LibroEntity;

import java.util.List;

public interface LibroRepository extends JpaRepository<LibroEntity, Long> {

    @Query("select l from LibroEntity l where l.estado=true")
    List<LibroEntity> findAllCustom();

}
