package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.OrdenPagoEntity;
import pe.com.unfpg.repository.OrdenPagoRepository;
import pe.com.unfpg.service.OrdenPagoService;

import java.util.List;

@Service
public class OrdenPagoServiceImpl implements OrdenPagoService {
    private OrdenPagoRepository repositorio;

    public OrdenPagoServiceImpl(OrdenPagoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<OrdenPagoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<OrdenPagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public OrdenPagoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public OrdenPagoEntity add(OrdenPagoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public OrdenPagoEntity update(OrdenPagoEntity obj, Long id) {
        OrdenPagoEntity objord=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objord);
        return repositorio.save(objord);
    }
    @Override
    public OrdenPagoEntity delete(Long id) {
        OrdenPagoEntity objord=repositorio.findById(id).get();
        objord.setEstado(false);
        return repositorio.save(objord);
    }
    @Override
    public OrdenPagoEntity enable(Long id) {
        OrdenPagoEntity objord=repositorio.findById(id).get();
        objord.setEstado(true);
        return repositorio.save(objord);
    }
}
