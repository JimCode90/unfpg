package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.UbicacionEntity;
import pe.com.unfpg.repository.UbicacionRepository;
import pe.com.unfpg.service.UbicacionService;

import java.util.List;

@Service
public class UbicacionServiceImpl implements UbicacionService {

    @Autowired
    private UbicacionRepository repositorio;

    @Override
    public List<UbicacionEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<UbicacionEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public UbicacionEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public UbicacionEntity add(UbicacionEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public UbicacionEntity update(UbicacionEntity obj, Long id) {
        UbicacionEntity objubi=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objubi);
        return repositorio.save(objubi);
    }
    @Override
    public UbicacionEntity delete(Long id) {
        UbicacionEntity objubi=repositorio.findById(id).get();
        objubi.setEstado(false);
        return repositorio.save(objubi);
    }
    @Override
    public UbicacionEntity enable(Long id) {
        UbicacionEntity objubi=repositorio.findById(id).get();
        objubi.setEstado(true);
        return repositorio.save(objubi);
    }
}
