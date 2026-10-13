package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoCalificacionEntity;
import pe.com.unfpg.repository.TipoCalificacionRepository;
import pe.com.unfpg.service.TipoCalificacionService;

import java.util.List;

@Service
public class TipoCalificacionServiceImpl implements TipoCalificacionService {

    @Autowired
    private TipoCalificacionRepository repositorio;

    @Override
    public List<TipoCalificacionEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<TipoCalificacionEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public TipoCalificacionEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public TipoCalificacionEntity add(TipoCalificacionEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public TipoCalificacionEntity update(TipoCalificacionEntity obj, Long id) {
        TipoCalificacionEntity objtipc = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objtipc);
        return repositorio.save(objtipc);
    }
    @Override
    public TipoCalificacionEntity delete(Long id) {
        TipoCalificacionEntity objtipc = repositorio.findById(id).get();
        objtipc.setEstado(false);
        return repositorio.save(objtipc);
    }
    @Override
    public TipoCalificacionEntity enable(Long id) {
        TipoCalificacionEntity objtipc = repositorio.findById(id).get();
        objtipc.setEstado(true);
        return repositorio.save(objtipc);
    }

}
