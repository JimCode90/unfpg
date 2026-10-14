package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.PrestamoLibroEntity;
import pe.com.unfpg.repository.PrestamoLibroRepository;
import pe.com.unfpg.service.PrestamoLibroService;

import java.util.List;

@Service
public class PrestamoLibroServiceImpl implements PrestamoLibroService {
    private PrestamoLibroRepository repositorio;

    public PrestamoLibroServiceImpl(PrestamoLibroRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<PrestamoLibroEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<PrestamoLibroEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public PrestamoLibroEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public PrestamoLibroEntity add(PrestamoLibroEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public PrestamoLibroEntity update(PrestamoLibroEntity obj, Long id) {
        PrestamoLibroEntity objpre=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objpre);
        return repositorio.save(objpre);
    }
    @Override
    public PrestamoLibroEntity delete(Long id) {
        PrestamoLibroEntity objpre=repositorio.findById(id).get();
        objpre.setEstado(false);
        return repositorio.save(objpre);
    }
    @Override
    public PrestamoLibroEntity enable(Long id) {
        PrestamoLibroEntity objpre=repositorio.findById(id).get();
        objpre.setEstado(true);
        return repositorio.save(objpre);
    }
}
