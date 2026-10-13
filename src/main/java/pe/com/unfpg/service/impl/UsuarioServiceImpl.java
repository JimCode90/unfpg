package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.UsuarioEntity;
import pe.com.unfpg.repository.UsuarioRepository;
import pe.com.unfpg.service.UsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository repositorio;

    public UsuarioServiceImpl(UsuarioRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<UsuarioEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<UsuarioEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public UsuarioEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public UsuarioEntity add(UsuarioEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public UsuarioEntity update(UsuarioEntity obj, Long id) {
        UsuarioEntity objusu=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objusu);
        return repositorio.save(objusu);
    }
    @Override
    public UsuarioEntity delete(Long id) {
        UsuarioEntity objusu=repositorio.findById(id).get();
        objusu.setEstado(false);
        return repositorio.save(objusu);
    }
    @Override
    public UsuarioEntity enable(Long id) {
        UsuarioEntity objusu=repositorio.findById(id).get();
        objusu.setEstado(true);
        return repositorio.save(objusu);
    }
}
