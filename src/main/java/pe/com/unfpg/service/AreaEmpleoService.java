package pe.com.unfpg.service;

import pe.com.unfpg.entity.AreaEmpleoEntity;

import java.util.List;

public interface AreaEmpleoService {
    List<AreaEmpleoEntity> findAll();
    List<AreaEmpleoEntity> findAllCustom();
    AreaEmpleoEntity findById(Long id);
    AreaEmpleoEntity add(AreaEmpleoEntity obj);
    AreaEmpleoEntity update(AreaEmpleoEntity obj, Long id);
    AreaEmpleoEntity delete(Long id);
    AreaEmpleoEntity enable(Long id);
}
