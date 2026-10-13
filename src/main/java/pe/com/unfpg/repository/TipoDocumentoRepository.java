package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.TipoDocumentoEntity;

import java.util.List;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {

    @Query("select x from TipoDocumentoEntity x where x.estado=true")
    List<TipoDocumentoEntity> findAllCustom();
}
