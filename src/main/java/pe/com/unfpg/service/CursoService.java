package pe.com.unfpg.service;

import pe.com.unfpg.entity.CursoEntity;

import java.util.List;

public interface CursoService {

    List<CursoEntity> findAll();
    CursoEntity findById(Long id);
    CursoEntity add(CursoEntity obj);
    CursoEntity update(CursoEntity obj, Long id);

}
