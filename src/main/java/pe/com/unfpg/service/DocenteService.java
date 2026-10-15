package pe.com.unfpg.service;

import pe.com.unfpg.entity.DocenteEntity;

import java.util.List;

public interface DocenteService {

    List<DocenteEntity> findAll();
    List<DocenteEntity> findAllCustom();
    DocenteEntity findById(Long id);
    DocenteEntity add(DocenteEntity obj);
    DocenteEntity update(DocenteEntity obj, Long id);
    DocenteEntity delete(Long id);
    DocenteEntity enable(Long id);
}
