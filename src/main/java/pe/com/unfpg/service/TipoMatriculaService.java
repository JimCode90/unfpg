package pe.com.unfpg.service;

import pe.com.unfpg.entity.TipoMatriculaEntity;

import java.util.List;

public interface TipoMatriculaService {

    List<TipoMatriculaEntity> findAll();
    List<TipoMatriculaEntity> findAllCustom();
    TipoMatriculaEntity findById(Long id);
    TipoMatriculaEntity add(TipoMatriculaEntity obj);
    TipoMatriculaEntity update(TipoMatriculaEntity obj, Long id);
    TipoMatriculaEntity delete(Long id);
    TipoMatriculaEntity enable(Long id);

}
