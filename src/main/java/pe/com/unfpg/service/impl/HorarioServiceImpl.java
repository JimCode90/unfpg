package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.HorarioEntity;
import pe.com.unfpg.repository.HorarioRepository;
import pe.com.unfpg.service.HorarioService;

import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {
    private HorarioRepository repositorio;

    public HorarioServiceImpl(HorarioRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<HorarioEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public HorarioEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public HorarioEntity add(HorarioEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public HorarioEntity update(HorarioEntity obj, Long id) {
        HorarioEntity objhor=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objhor);
        return repositorio.save(objhor);
    }
}
