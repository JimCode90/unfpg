package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.RolLmsEntity;
import pe.com.unfpg.repository.RolLmsRepository;
import pe.com.unfpg.service.RolLmsService;

import java.util.List;

@Service
public class RolLmsServiceImpl implements RolLmsService {

    @Autowired
    private RolLmsRepository repositorio;

    @Override
    public List<RolLmsEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<RolLmsEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public RolLmsEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public RolLmsEntity add(RolLmsEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public RolLmsEntity update(RolLmsEntity obj, Long id) {
        RolLmsEntity objroll = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objroll);
        return repositorio.save(objroll);
    }
    @Override
    public RolLmsEntity delete(Long id) {
        RolLmsEntity objroll = repositorio.findById(id).get();
        objroll.setEstado(false);
        return repositorio.save(objroll);
    }
    @Override
    public RolLmsEntity enable(Long id) {
        RolLmsEntity objroll = repositorio.findById(id).get();
        objroll.setEstado(true);
        return repositorio.save(objroll);
    }

}
