package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DocenteEntity;
import pe.com.unfpg.repository.DocenteRepository;
import pe.com.unfpg.service.DocenteService;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {
    private DocenteRepository repositorio;

    public DocenteServiceImpl(DocenteRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<DocenteEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<DocenteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public DocenteEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public DocenteEntity add(DocenteEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public DocenteEntity update(DocenteEntity obj, Long id) {
        DocenteEntity objdoc=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objdoc);
        return repositorio.save(objdoc);
    }
    @Override
    public DocenteEntity delete(Long id) {
        DocenteEntity objdoc=repositorio.findById(id).get();
        objdoc.setEstado(false);
        return repositorio.save(objdoc);
    }
    @Override
    public DocenteEntity enable(Long id) {
        DocenteEntity objdoc=repositorio.findById(id).get();
        objdoc.setEstado(true);
        return repositorio.save(objdoc);
    }
}
