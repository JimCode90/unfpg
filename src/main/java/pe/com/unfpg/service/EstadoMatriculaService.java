package pe.com.unfpg.service;

import pe.com.unfpg.entity.EstadoMatriculaEntity;

import java.util.List;

public interface EstadoMatriculaService {

    List<EstadoMatriculaEntity> findAll();
    List<EstadoMatriculaEntity> findAllCustom();
    EstadoMatriculaEntity findById(Long id);
    EstadoMatriculaEntity add(EstadoMatriculaEntity obj);
    EstadoMatriculaEntity update(EstadoMatriculaEntity obj, Long id);
    EstadoMatriculaEntity delete(Long id);
    EstadoMatriculaEntity enable(Long id);

}
