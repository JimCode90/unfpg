package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.FacultadEntity;
import pe.com.unfpg.repository.FacultadRepository;
import pe.com.unfpg.service.FacultadService;

import java.util.List;

@Service
public class FacultadServiceImpl implements FacultadService {

    @Autowired
    private FacultadRepository repositorio;

    @Override
    public List<FacultadEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<FacultadEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public FacultadEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public FacultadEntity add(FacultadEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public FacultadEntity update(FacultadEntity obj, Long id) {
        FacultadEntity objfac = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objfac);
        return repositorio.save(objfac);
    }
    @Override
    public FacultadEntity delete(Long id) {
        FacultadEntity objfac = repositorio.findById(id).get();
        objfac.setEstado(false);
        return repositorio.save(objfac);
    }
    @Override
    public FacultadEntity enable(Long id) {
        FacultadEntity objfac = repositorio.findById(id).get();
        objfac.setEstado(true);
        return repositorio.save(objfac);
    }

}
