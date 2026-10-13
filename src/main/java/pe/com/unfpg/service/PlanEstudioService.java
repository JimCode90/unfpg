package pe.com.unfpg.service;

import pe.com.unfpg.entity.PlanEstudioEntity;

import java.util.List;

public interface PlanEstudioService {

    List<PlanEstudioEntity> findAll();
    List<PlanEstudioEntity> findAllCustom();
    PlanEstudioEntity findById(Long id);
    PlanEstudioEntity add(PlanEstudioEntity obj);
    PlanEstudioEntity update(PlanEstudioEntity obj, Long id);
    PlanEstudioEntity delete(Long id);
    PlanEstudioEntity enable(Long id);

}
