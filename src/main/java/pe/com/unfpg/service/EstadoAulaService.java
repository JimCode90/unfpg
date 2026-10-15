package pe.com.unfpg.service;

import pe.com.unfpg.entity.EstadoAulaEntity;

import java.util.List;

public interface EstadoAulaService {
    List<EstadoAulaEntity> findAll();
    List<EstadoAulaEntity> findAllCustom();
    EstadoAulaEntity findById(Long id);
    EstadoAulaEntity add(EstadoAulaEntity obj);
    EstadoAulaEntity update(EstadoAulaEntity obj, Long id);
    EstadoAulaEntity delete(Long id);
    EstadoAulaEntity enable(Long id);
}
