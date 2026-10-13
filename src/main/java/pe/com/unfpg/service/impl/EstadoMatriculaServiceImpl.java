package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoMatriculaEntity;
import pe.com.unfpg.repository.EstadoMatriculaRepository;
import pe.com.unfpg.service.EstadoMatriculaService;

import java.util.List;

@Service
public class EstadoMatriculaServiceImpl implements EstadoMatriculaService {

    @Autowired
    private EstadoMatriculaRepository repositorio;

    @Override
    public List<EstadoMatriculaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EstadoMatriculaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EstadoMatriculaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EstadoMatriculaEntity add(EstadoMatriculaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EstadoMatriculaEntity update(EstadoMatriculaEntity obj, Long id) {
        EstadoMatriculaEntity objestm = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objestm);
        return repositorio.save(objestm);
    }
    @Override
    public EstadoMatriculaEntity delete(Long id) {
        EstadoMatriculaEntity objestm = repositorio.findById(id).get();
        objestm.setEstado(false);
        return repositorio.save(objestm);
    }
    @Override
    public EstadoMatriculaEntity enable(Long id) {
        EstadoMatriculaEntity objestm = repositorio.findById(id).get();
        objestm.setEstado(true);
        return repositorio.save(objestm);
    }

}
