package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.CategoriaLibroEntity;

import java.util.List;

public interface CategoriaLibroRepository extends JpaRepository<CategoriaLibroEntity, Long> {

    @Query("select c from CategoriaLibroEntity c where c.estado=true")
    List<CategoriaLibroEntity> findAllCustom();

}
