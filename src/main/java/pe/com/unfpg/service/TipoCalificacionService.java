package pe.com.unfpg.service;

import pe.com.unfpg.entity.TipoCalificacionEntity;

import java.util.List;

public interface TipoCalificacionService {

    List<TipoCalificacionEntity> findAll();
    List<TipoCalificacionEntity> findAllCustom();
    TipoCalificacionEntity findById(Long id);
    TipoCalificacionEntity add(TipoCalificacionEntity obj);
    TipoCalificacionEntity update(TipoCalificacionEntity obj, Long id);
    TipoCalificacionEntity delete(Long id);
    TipoCalificacionEntity enable(Long id);

}
