package pe.com.unfpg.service;

import pe.com.unfpg.entity.HorarioEntity;

import java.util.List;

public interface HorarioService {

    List<HorarioEntity> findAll();
    HorarioEntity findById(Long id);
    HorarioEntity add(HorarioEntity obj);
    HorarioEntity update(HorarioEntity obj, Long id);
}
