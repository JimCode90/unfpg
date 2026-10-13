package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoAulaEntity;
import pe.com.unfpg.repository.TipoAulaRepository;
import pe.com.unfpg.service.TipoAulaService;

import java.util.List;

@Service
public class TipoAulaServiceImpl implements TipoAulaService {

    @Autowired
    private TipoAulaRepository repositorio;

    @Override
    public List<TipoAulaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<TipoAulaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public TipoAulaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public TipoAulaEntity add(TipoAulaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public TipoAulaEntity update(TipoAulaEntity obj, Long id) {
        TipoAulaEntity objtip=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objtip);
        return repositorio.save(objtip);
    }
    @Override
    public TipoAulaEntity delete(Long id) {
        TipoAulaEntity objtip=repositorio.findById(id).get();
        objtip.setEstado(false);
        return repositorio.save(objtip);
    }
    @Override
    public TipoAulaEntity enable(Long id) {
        TipoAulaEntity objtip=repositorio.findById(id).get();
        objtip.setEstado(true);
        return repositorio.save(objtip);
    }
}
