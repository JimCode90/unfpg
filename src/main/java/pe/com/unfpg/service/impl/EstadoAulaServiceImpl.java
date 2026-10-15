package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoAulaEntity;
import pe.com.unfpg.repository.EstadoAulaRepository;
import pe.com.unfpg.service.EstadoAulaService;

import java.util.List;

@Service
public class EstadoAulaServiceImpl implements EstadoAulaService {

    @Autowired
    private EstadoAulaRepository repositorio;

    @Override
    public List<EstadoAulaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EstadoAulaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EstadoAulaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EstadoAulaEntity add(EstadoAulaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EstadoAulaEntity update(EstadoAulaEntity obj, Long id) {
        EstadoAulaEntity objest=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objest);
        return repositorio.save(objest);
    }
    @Override
    public EstadoAulaEntity delete(Long id) {
        EstadoAulaEntity objest=repositorio.findById(id).get();
        objest.setEstado(false);
        return repositorio.save(objest);
    }
    @Override
    public EstadoAulaEntity enable(Long id) {
        EstadoAulaEntity objest=repositorio.findById(id).get();
        objest.setEstado(true);
        return repositorio.save(objest);
    }
}
