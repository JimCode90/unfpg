package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.ConceptoPagoEntity;

import java.util.List;

public interface ConceptoPagoRepository extends JpaRepository<ConceptoPagoEntity, Long> {

    @Query("select c from ConceptoPagoEntity c where c.estado=true")
    List<ConceptoPagoEntity> findAllCustom();

}
