package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoPrestamoLibroEntity;
import pe.com.unfpg.repository.EstadoPrestamoLibroRepository;
import pe.com.unfpg.service.EstadoPrestamoLibroService;

import java.util.List;

@Service
public class EstadoPrestamoLibroServiceImpl implements EstadoPrestamoLibroService {

    @Autowired
    private EstadoPrestamoLibroRepository repositorio;

    @Override
    public List<EstadoPrestamoLibroEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EstadoPrestamoLibroEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EstadoPrestamoLibroEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EstadoPrestamoLibroEntity add(EstadoPrestamoLibroEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EstadoPrestamoLibroEntity update(EstadoPrestamoLibroEntity obj, Long id) {
        EstadoPrestamoLibroEntity objestl = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objestl);
        return repositorio.save(objestl);
    }
    @Override
    public EstadoPrestamoLibroEntity delete(Long id) {
        EstadoPrestamoLibroEntity objestl = repositorio.findById(id).get();
        objestl.setEstado(false);
        return repositorio.save(objestl);
    }
    @Override
    public EstadoPrestamoLibroEntity enable(Long id) {
        EstadoPrestamoLibroEntity objestl = repositorio.findById(id).get();
        objestl.setEstado(true);
        return repositorio.save(objestl);
    }

}
