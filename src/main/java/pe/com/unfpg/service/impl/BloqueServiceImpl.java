package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.BloqueEntity;
import pe.com.unfpg.repository.BloqueRepository;
import pe.com.unfpg.service.BloqueService;

import java.util.List;

@Service
public class BloqueServiceImpl implements BloqueService {

    @Autowired
    private BloqueRepository repositorio;

    @Override
    public List<BloqueEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<BloqueEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public BloqueEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public BloqueEntity add(BloqueEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public BloqueEntity update(BloqueEntity obj, Long id) {
        BloqueEntity objblo=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objblo);
        return repositorio.save(objblo);
    }
    @Override
    public BloqueEntity delete(Long id) {
        BloqueEntity objblo=repositorio.findById(id).get();
        objblo.setEstado(false);
        return repositorio.save(objblo);
    }
    @Override
    public BloqueEntity enable(Long id) {
        BloqueEntity objblo=repositorio.findById(id).get();
        objblo.setEstado(true);
        return repositorio.save(objblo);
    }
}
