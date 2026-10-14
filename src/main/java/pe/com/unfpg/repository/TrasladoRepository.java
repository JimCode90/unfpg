package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.TrasladoEntity;

import java.util.List;

public interface TrasladoRepository extends JpaRepository<TrasladoEntity, Long> {
    @Query("select t from TrasladoEntity t where t.estado=true")
    List<TrasladoEntity> findAllCustom();
}
