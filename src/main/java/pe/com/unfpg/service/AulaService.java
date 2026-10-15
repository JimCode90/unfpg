package pe.com.unfpg.service;

import pe.com.unfpg.entity.AulaEntity;

import java.util.List;

public interface AulaService {

    List<AulaEntity> findAll();
    AulaEntity findById(Long id);
    AulaEntity add(AulaEntity obj);
    AulaEntity update(AulaEntity obj, Long id);
}
