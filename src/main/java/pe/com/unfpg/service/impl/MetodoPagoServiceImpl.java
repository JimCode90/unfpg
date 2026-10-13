package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.MetodoPagoEntity;
import pe.com.unfpg.repository.MetodoPagoRepository;
import pe.com.unfpg.service.MetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

    @Autowired
    private MetodoPagoRepository repositorio;

    @Override
    public List<MetodoPagoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<MetodoPagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public MetodoPagoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public MetodoPagoEntity add(MetodoPagoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public MetodoPagoEntity update(MetodoPagoEntity obj, Long id) {
        MetodoPagoEntity objmetp = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objmetp);
        return repositorio.save(objmetp);
    }
    @Override
    public MetodoPagoEntity delete(Long id) {
        MetodoPagoEntity objmetp = repositorio.findById(id).get();
        objmetp.setEstado(false);
        return repositorio.save(objmetp);
    }
    @Override
    public MetodoPagoEntity enable(Long id) {
        MetodoPagoEntity objmetp = repositorio.findById(id).get();
        objmetp.setEstado(true);
        return repositorio.save(objmetp);
    }

}
