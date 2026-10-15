package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CursoEntity;
import pe.com.unfpg.repository.CursoRepository;
import pe.com.unfpg.service.CursoService;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    private CursoRepository repositorio;

    public CursoServiceImpl(CursoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<CursoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public CursoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public CursoEntity add(CursoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public CursoEntity update(CursoEntity obj, Long id) {
        CursoEntity objcur = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcur);
        return repositorio.save(objcur);
    }

}
