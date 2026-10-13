package pe.com.unfpg.service;

import pe.com.unfpg.entity.GradoInstruccionEntity;

import java.util.List;

public interface GradoInstruccionService {
    List<GradoInstruccionEntity> findAll();
    List<GradoInstruccionEntity> findAllCustom();
    GradoInstruccionEntity findById(Long id);
    GradoInstruccionEntity add(GradoInstruccionEntity obj);
    GradoInstruccionEntity update(GradoInstruccionEntity obj, Long id);
    GradoInstruccionEntity delete(Long id);
    GradoInstruccionEntity enable(Long id);
}
