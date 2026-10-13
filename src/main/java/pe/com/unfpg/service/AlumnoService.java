package pe.com.unfpg.service;

import pe.com.unfpg.entity.AlumnoEntity;

import java.util.List;

public interface AlumnoService {

    List<AlumnoEntity> findAll();
    List<AlumnoEntity> findAllCustom();
    AlumnoEntity findById(Long id);
    AlumnoEntity add(AlumnoEntity obj);
    AlumnoEntity update(AlumnoEntity obj, Long id);
    AlumnoEntity delete(Long id);
    AlumnoEntity enable(Long id);
}
