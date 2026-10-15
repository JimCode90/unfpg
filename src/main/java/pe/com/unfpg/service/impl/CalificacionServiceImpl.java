package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CalificacionEntity;
import pe.com.unfpg.repository.CalificacionRepository;
import pe.com.unfpg.service.CalificacionService;

import java.util.List;

@Service
public class CalificacionServiceImpl implements CalificacionService {
    private CalificacionRepository repositorio;

    public CalificacionServiceImpl(CalificacionRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<CalificacionEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public CalificacionEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public CalificacionEntity add(CalificacionEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public CalificacionEntity update(CalificacionEntity obj, Long id) {
        CalificacionEntity objcal=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcal);
        return repositorio.save(objcal);
    }
}
