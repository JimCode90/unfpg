package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CursoLmsEntity;
import pe.com.unfpg.repository.CursoLmsRepository;
import pe.com.unfpg.service.CursoLmsService;

import java.util.List;

@Service
public class CursoLmsServiceImpl implements CursoLmsService {
    private CursoLmsRepository repositorio;

    public CursoLmsServiceImpl(CursoLmsRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<CursoLmsEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<CursoLmsEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public CursoLmsEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public CursoLmsEntity add(CursoLmsEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public CursoLmsEntity update(CursoLmsEntity obj, Long id) {
        CursoLmsEntity objcul=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcul);
        return repositorio.save(objcul);
    }
    @Override
    public CursoLmsEntity delete(Long id) {
        CursoLmsEntity objcul=repositorio.findById(id).get();
        objcul.setEstado(false);
        return repositorio.save(objcul);
    }
    @Override
    public CursoLmsEntity enable(Long id) {
        CursoLmsEntity objcul=repositorio.findById(id).get();
        objcul.setEstado(true);
        return repositorio.save(objcul);
    }
}
