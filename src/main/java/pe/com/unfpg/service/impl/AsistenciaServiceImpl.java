package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AsistenciaEntity;
import pe.com.unfpg.repository.AsistenciaRepository;
import pe.com.unfpg.service.AsistenciaService;

import java.util.List;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {
    private AsistenciaRepository repositorio;

    public AsistenciaServiceImpl(AsistenciaRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<AsistenciaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public AsistenciaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public AsistenciaEntity add(AsistenciaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public AsistenciaEntity update(AsistenciaEntity obj, Long id) {
        AsistenciaEntity objasi=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objasi);
        return repositorio.save(objasi);
    }
}
