package pe.com.unfpg.service;

import pe.com.unfpg.entity.AsistenciaEntity;

import java.util.List;

public interface AsistenciaService {

    List<AsistenciaEntity> findAll();
    AsistenciaEntity findById(Long id);
    AsistenciaEntity add(AsistenciaEntity obj);
    AsistenciaEntity update(AsistenciaEntity obj, Long id);
}
