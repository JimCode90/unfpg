package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoMatriculaEntity;
import pe.com.unfpg.repository.TipoMatriculaRepository;
import pe.com.unfpg.service.TipoMatriculaService;

import java.util.List;

@Service
public class TipoMatriculaServiceImpl implements TipoMatriculaService {

    @Autowired
    private TipoMatriculaRepository repositorio;

    @Override
    public List<TipoMatriculaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<TipoMatriculaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public TipoMatriculaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public TipoMatriculaEntity add(TipoMatriculaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public TipoMatriculaEntity update(TipoMatriculaEntity obj, Long id) {
        TipoMatriculaEntity objtipm = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objtipm);
        return repositorio.save(objtipm);
    }
    @Override
    public TipoMatriculaEntity delete(Long id) {
        TipoMatriculaEntity objtipm = repositorio.findById(id).get();
        objtipm.setEstado(false);
        return repositorio.save(objtipm);
    }
    @Override
    public TipoMatriculaEntity enable(Long id) {
        TipoMatriculaEntity objtipm = repositorio.findById(id).get();
        objtipm.setEstado(true);
        return repositorio.save(objtipm);
    }

}
