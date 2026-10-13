package pe.com.unfpg.service;

import pe.com.unfpg.entity.FacultadEntity;

import java.util.List;

public interface FacultadService {

    List<FacultadEntity> findAll();
    List<FacultadEntity> findAllCustom();
    FacultadEntity findById(Long id);
    FacultadEntity add(FacultadEntity obj);
    FacultadEntity update(FacultadEntity obj, Long id);
    FacultadEntity delete(Long id);
    FacultadEntity enable(Long id);

}
