package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.PeriodoAcademicoEntity;
import pe.com.unfpg.repository.PeriodoAcademicoRepository;
import pe.com.unfpg.service.PeriodoAcademicoService;

import java.util.List;

@Service
public class PeriodoAcademicoServiceImpl implements PeriodoAcademicoService {

    @Autowired
    private PeriodoAcademicoRepository repositorio;

    @Override
    public List<PeriodoAcademicoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<PeriodoAcademicoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public PeriodoAcademicoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public PeriodoAcademicoEntity add(PeriodoAcademicoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public PeriodoAcademicoEntity update(PeriodoAcademicoEntity obj, Long id) {
        PeriodoAcademicoEntity objper = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objper);
        return repositorio.save(objper);
    }
    @Override
    public PeriodoAcademicoEntity delete(Long id) {
        PeriodoAcademicoEntity objper = repositorio.findById(id).get();
        objper.setEstado(false);
        return repositorio.save(objper);
    }
    @Override
    public PeriodoAcademicoEntity enable(Long id) {
        PeriodoAcademicoEntity objper = repositorio.findById(id).get();
        objper.setEstado(true);
        return repositorio.save(objper);
    }

}
