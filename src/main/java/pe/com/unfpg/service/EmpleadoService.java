package pe.com.unfpg.service;

import pe.com.unfpg.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoService {

    List<EmpleadoEntity> findAll();
    List<EmpleadoEntity> findAllCustom();
    EmpleadoEntity findById(Long id);
    EmpleadoEntity add(EmpleadoEntity obj);
    EmpleadoEntity update(EmpleadoEntity obj, Long id);
    EmpleadoEntity delete(Long id);
    EmpleadoEntity enable(Long id);
}
