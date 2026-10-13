package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DiaSemanaEntity;
import pe.com.unfpg.repository.DiaSemanaRepository;
import pe.com.unfpg.service.DiaSemanaService;

import java.util.List;

@Service
public class DiaSemanaServiceImpl implements DiaSemanaService {

    @Autowired
    private DiaSemanaRepository repositorio;

    @Override
    public List<DiaSemanaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<DiaSemanaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public DiaSemanaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public DiaSemanaEntity add(DiaSemanaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public DiaSemanaEntity update(DiaSemanaEntity obj, Long id) {
        DiaSemanaEntity objdia=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objdia);
        return repositorio.save(objdia);
    }
    @Override
    public DiaSemanaEntity delete(Long id) {
        DiaSemanaEntity objdia=repositorio.findById(id).get();
        objdia.setEstado(false);
        return repositorio.save(objdia);
    }
    @Override
    public DiaSemanaEntity enable(Long id) {
        DiaSemanaEntity objdia=repositorio.findById(id).get();
        objdia.setEstado(true);
        return repositorio.save(objdia);
    }
}
