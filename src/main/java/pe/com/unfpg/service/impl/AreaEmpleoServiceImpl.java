package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AreaEmpleoEntity;
import pe.com.unfpg.repository.AreaEmpleoRepository;
import pe.com.unfpg.service.AreaEmpleoService;

import java.util.List;

@Service
public class AreaEmpleoServiceImpl implements AreaEmpleoService {

    @Autowired
    private AreaEmpleoRepository repositorio;

    @Override
    public List<AreaEmpleoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<AreaEmpleoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public AreaEmpleoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public AreaEmpleoEntity add(AreaEmpleoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public AreaEmpleoEntity update(AreaEmpleoEntity obj, Long id) {
        AreaEmpleoEntity objare=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objare);
        return repositorio.save(objare);
    }
    @Override
    public AreaEmpleoEntity delete(Long id) {
        AreaEmpleoEntity objare=repositorio.findById(id).get();
        objare.setEstado(false);
        return repositorio.save(objare);
    }
    @Override
    public AreaEmpleoEntity enable(Long id) {
        AreaEmpleoEntity objare=repositorio.findById(id).get();
        objare.setEstado(true);
        return repositorio.save(objare);
    }
}
