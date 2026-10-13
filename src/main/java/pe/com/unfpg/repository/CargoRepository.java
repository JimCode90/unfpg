package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.CargoEntity;

import java.util.List;

public interface CargoRepository extends JpaRepository<CargoEntity, Long> {

    @Query("select x from CargoEntity x where x.estado=true")
    List<CargoEntity> findAllCustom();
}
