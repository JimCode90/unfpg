package pe.com.unfpg.service;

import pe.com.unfpg.entity.EstadoCivilEntity;

import java.util.List;

public interface EstadoCivilService {
    List<EstadoCivilEntity> findAll();
    List<EstadoCivilEntity> findAllCustom();
    EstadoCivilEntity findById(Long id);
    EstadoCivilEntity add(EstadoCivilEntity obj);
    EstadoCivilEntity update(EstadoCivilEntity obj, Long id);
    EstadoCivilEntity delete(Long id);
    EstadoCivilEntity enable(Long id);
}
