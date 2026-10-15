package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoPagoEntity;
import pe.com.unfpg.repository.EstadoPagoRepository;
import pe.com.unfpg.service.EstadoPagoService;

import java.util.List;

@Service
public class EstadoPagoServiceImpl implements EstadoPagoService {

    @Autowired
    private EstadoPagoRepository repositorio;

    @Override
    public List<EstadoPagoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EstadoPagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EstadoPagoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EstadoPagoEntity add(EstadoPagoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EstadoPagoEntity update(EstadoPagoEntity obj, Long id) {
        EstadoPagoEntity objestp = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objestp);
        return repositorio.save(objestp);
    }
    @Override
    public EstadoPagoEntity delete(Long id) {
        EstadoPagoEntity objestp = repositorio.findById(id).get();
        objestp.setEstado(false);
        return repositorio.save(objestp);
    }
    @Override
    public EstadoPagoEntity enable(Long id) {
        EstadoPagoEntity objestp = repositorio.findById(id).get();
        objestp.setEstado(true);
        return repositorio.save(objestp);
    }

}
