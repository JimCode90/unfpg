package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.GradoInstruccionEntity;
import pe.com.unfpg.repository.GradoInstruccionRepository;
import pe.com.unfpg.service.GradoInstruccionService;

import java.util.List;

@Service
public class GradoInstruccionServiceImpl implements GradoInstruccionService {

    @Autowired
    private GradoInstruccionRepository repositorio;

    @Override
    public List<GradoInstruccionEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<GradoInstruccionEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public GradoInstruccionEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public GradoInstruccionEntity add(GradoInstruccionEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public GradoInstruccionEntity update(GradoInstruccionEntity obj, Long id) {
        GradoInstruccionEntity objgra=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objgra);
        return repositorio.save(objgra);
    }
    @Override
    public GradoInstruccionEntity delete(Long id) {
        GradoInstruccionEntity objgra=repositorio.findById(id).get();
        objgra.setEstado(false);
        return repositorio.save(objgra);
    }
    @Override
    public GradoInstruccionEntity enable(Long id) {
        GradoInstruccionEntity objgra=repositorio.findById(id).get();
        objgra.setEstado(true);
        return repositorio.save(objgra);
    }
}
