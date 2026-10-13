package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AlumnoEntity;
import pe.com.unfpg.repository.AlumnoRepository;
import pe.com.unfpg.service.AlumnoService;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    //inyección de dependencia en el método constructor
    private AlumnoRepository repositorio;

    public AlumnoServiceImpl(AlumnoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<AlumnoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<AlumnoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public AlumnoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public AlumnoEntity add(AlumnoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public AlumnoEntity update(AlumnoEntity obj, Long id) {
        AlumnoEntity objalu=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objalu);
        return repositorio.save(objalu);
    }
    @Override
    public AlumnoEntity delete(Long id) {
        AlumnoEntity objalu=repositorio.findById(id).get();
        objalu.setEstado(false);
        return repositorio.save(objalu);
    }
    @Override
    public AlumnoEntity enable(Long id) {
        AlumnoEntity objalu=repositorio.findById(id).get();
        objalu.setEstado(true);
        return repositorio.save(objalu);
    }
}
