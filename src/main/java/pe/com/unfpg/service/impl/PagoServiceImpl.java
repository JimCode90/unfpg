package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.PagoEntity;
import pe.com.unfpg.repository.PagoRepository;
import pe.com.unfpg.service.PagoService;

import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {
    private PagoRepository repositorio;

    public PagoServiceImpl(PagoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<PagoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<PagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public PagoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public PagoEntity add(PagoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public PagoEntity update(PagoEntity obj, Long id) {
        PagoEntity objpag=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objpag);
        return repositorio.save(objpag);
    }
    @Override
    public PagoEntity delete(Long id) {
        PagoEntity objpag=repositorio.findById(id).get();
        objpag.setEstado(false);
        return repositorio.save(objpag);
    }
    @Override
    public PagoEntity enable(Long id) {
        PagoEntity objpag=repositorio.findById(id).get();
        objpag.setEstado(true);
        return repositorio.save(objpag);
    }
}
