package pe.com.unfpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    @Query("select x from UsuarioEntity x where x.estado=true")
    List<UsuarioEntity> findAllCustom();
}
