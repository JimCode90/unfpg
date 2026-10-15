package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoCivilEntity;
import pe.com.unfpg.repository.EstadoCivilRepository;
import pe.com.unfpg.service.EstadoCivilService;

import java.util.List;

@Service
public class EstadoCivilServiceImpl implements EstadoCivilService {

    @Autowired
    private EstadoCivilRepository repositorio;

    @Override
    public List<EstadoCivilEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EstadoCivilEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EstadoCivilEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EstadoCivilEntity add(EstadoCivilEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EstadoCivilEntity update(EstadoCivilEntity obj, Long id) {
        EstadoCivilEntity objest=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objest);
        return repositorio.save(objest);
    }
    @Override
    public EstadoCivilEntity delete(Long id) {
        EstadoCivilEntity objest=repositorio.findById(id).get();
        objest.setEstado(false);
        return repositorio.save(objest);
    }
    @Override
    public EstadoCivilEntity enable(Long id) {
        EstadoCivilEntity objest=repositorio.findById(id).get();
        objest.setEstado(true);
        return repositorio.save(objest);
    }
}
