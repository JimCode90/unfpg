package pe.com.unfpg.service;

import pe.com.unfpg.entity.SeccionEntity;

import java.util.List;

public interface SeccionService {

    List<SeccionEntity> findAll();
    SeccionEntity findById(Long id);
    SeccionEntity add(SeccionEntity obj);
    SeccionEntity update(SeccionEntity obj, Long id);
}
