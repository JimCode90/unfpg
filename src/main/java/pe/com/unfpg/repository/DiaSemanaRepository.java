package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.DiaSemanaEntity;

import java.util.List;

public interface DiaSemanaRepository extends JpaRepository<DiaSemanaEntity, Long> {

    @Query("select x from DiaSemanaEntity x where x.estado=true")
    List<DiaSemanaEntity> findAllCustom();
}
