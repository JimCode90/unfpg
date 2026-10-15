package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.MetodoPagoEntity;

import java.util.List;

public interface MetodoPagoRepository extends JpaRepository<MetodoPagoEntity, Long> {

    @Query("select m from MetodoPagoEntity m where m.estado=true")
    List<MetodoPagoEntity> findAllCustom();

}
