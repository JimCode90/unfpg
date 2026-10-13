package pe.com.unfpg.service;

import pe.com.unfpg.entity.PeriodoAcademicoEntity;

import java.util.List;

public interface PeriodoAcademicoService {

    List<PeriodoAcademicoEntity> findAll();
    List<PeriodoAcademicoEntity> findAllCustom();
    PeriodoAcademicoEntity findById(Long id);
    PeriodoAcademicoEntity add(PeriodoAcademicoEntity obj);
    PeriodoAcademicoEntity update(PeriodoAcademicoEntity obj, Long id);
    PeriodoAcademicoEntity delete(Long id);
    PeriodoAcademicoEntity enable(Long id);

}
