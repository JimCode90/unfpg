package pe.com.unfpg.service;

import pe.com.unfpg.entity.SexoEntity;

import java.util.List;

public interface SexoService {
    List<SexoEntity> findAll();
    List<SexoEntity> findAllCustom();
    SexoEntity findById(Long id);
    SexoEntity add(SexoEntity obj);
    SexoEntity update(SexoEntity obj, Long id);
    SexoEntity delete(Long id);
    SexoEntity enable(Long id);
}
