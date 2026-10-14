package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TrasladoEntity;
import pe.com.unfpg.repository.TrasladoRepository;
import pe.com.unfpg.service.TrasladoService;

import java.util.List;

@Service
public class TrasladoServiceImpl implements TrasladoService {
    private TrasladoRepository repositorio;

    public TrasladoServiceImpl(TrasladoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<TrasladoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<TrasladoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public TrasladoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public TrasladoEntity add(TrasladoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public TrasladoEntity update(TrasladoEntity obj, Long id) {
        TrasladoEntity objtra=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objtra);
        return repositorio.save(objtra);
    }
    @Override
    public TrasladoEntity delete(Long id) {
        TrasladoEntity objtra=repositorio.findById(id).get();
        objtra.setEstado(false);
        return repositorio.save(objtra);
    }
    @Override
    public TrasladoEntity enable(Long id) {
        TrasladoEntity objtra=repositorio.findById(id).get();
        objtra.setEstado(true);
        return repositorio.save(objtra);
    }
}
