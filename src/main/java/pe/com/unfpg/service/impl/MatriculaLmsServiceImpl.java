package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.MatriculaLmsEntity;
import pe.com.unfpg.repository.MatriculaLmsRepository;
import pe.com.unfpg.service.MatriculaLmsService;

import java.util.List;

@Service
public class MatriculaLmsServiceImpl implements MatriculaLmsService {
    private MatriculaLmsRepository repositorio;

    public MatriculaLmsServiceImpl(MatriculaLmsRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<MatriculaLmsEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<MatriculaLmsEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public MatriculaLmsEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public MatriculaLmsEntity add(MatriculaLmsEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public MatriculaLmsEntity update(MatriculaLmsEntity obj, Long id) {
        MatriculaLmsEntity objmal=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objmal);
        return repositorio.save(objmal);
    }
    @Override
    public MatriculaLmsEntity delete(Long id) {
        MatriculaLmsEntity objmal=repositorio.findById(id).get();
        objmal.setEstado(false);
        return repositorio.save(objmal);
    }
    @Override
    public MatriculaLmsEntity enable(Long id) {
        MatriculaLmsEntity objmal=repositorio.findById(id).get();
        objmal.setEstado(true);
        return repositorio.save(objmal);
    }
}
