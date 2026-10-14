package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EjemplarLibroEntity;
import pe.com.unfpg.repository.EjemplarLibroRepository;
import pe.com.unfpg.service.EjemplarLibroService;

import java.util.List;

@Service
public class EjemplarLibroServiceImpl implements EjemplarLibroService {
    private EjemplarLibroRepository repositorio;

    public EjemplarLibroServiceImpl(EjemplarLibroRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<EjemplarLibroEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EjemplarLibroEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EjemplarLibroEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EjemplarLibroEntity add(EjemplarLibroEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EjemplarLibroEntity update(EjemplarLibroEntity obj, Long id) {
        EjemplarLibroEntity objeje=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objeje);
        return repositorio.save(objeje);
    }
    @Override
    public EjemplarLibroEntity delete(Long id) {
        EjemplarLibroEntity objeje=repositorio.findById(id).get();
        objeje.setEstado(false);
        return repositorio.save(objeje);
    }
    @Override
    public EjemplarLibroEntity enable(Long id) {
        EjemplarLibroEntity objeje=repositorio.findById(id).get();
        objeje.setEstado(true);
        return repositorio.save(objeje);
    }
}
