package pe.com.unfpg.service;

import pe.com.unfpg.entity.CalificacionEntity;

import java.util.List;

public interface CalificacionService {

    List<CalificacionEntity> findAll();
    CalificacionEntity findById(Long id);
    CalificacionEntity add(CalificacionEntity obj);
    CalificacionEntity update(CalificacionEntity obj, Long id);
}
