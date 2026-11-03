package pe.com.unfpg.service;

import pe.com.unfpg.entity.EmpleadoGradoEntity;

import java.util.List;

public interface EmpleadoGradoService {

    List<EmpleadoGradoEntity> findAll();
    EmpleadoGradoEntity findById(Long codemp, Long codgrai);
    EmpleadoGradoEntity add(EmpleadoGradoEntity obj);
    EmpleadoGradoEntity update(EmpleadoGradoEntity obj, Long codemp, Long codgrai);
}
