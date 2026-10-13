package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AulaEntity;
import pe.com.unfpg.repository.AulaRepository;
import pe.com.unfpg.service.AulaService;

import java.util.List;

@Service
public class AulaServiceImpl implements AulaService {
    private AulaRepository repositorio;

    public AulaServiceImpl(AulaRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<AulaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public AulaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public AulaEntity add(AulaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public AulaEntity update(AulaEntity obj, Long id) {
        AulaEntity objaul=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objaul);
        return repositorio.save(objaul);
    }
}
