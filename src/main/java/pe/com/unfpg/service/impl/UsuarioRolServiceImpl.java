package pe.com.unfpg.service.impl;

import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.UsuarioRolEntity;
import pe.com.unfpg.entity.UsuarioRolId;
import pe.com.unfpg.repository.UsuarioRolRepository;
import pe.com.unfpg.service.UsuarioRolService;

import java.util.List;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService {
    private UsuarioRolRepository repositorio;

    public UsuarioRolServiceImpl(UsuarioRolRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<UsuarioRolEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public UsuarioRolEntity findById(Long codusu, Long codrol) {
        return repositorio.findById(new UsuarioRolId(codusu, codrol)).get();
    }
    @Override
    public UsuarioRolEntity add(UsuarioRolEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public UsuarioRolEntity delete(Long codusu, Long codrol) {
        UsuarioRolEntity obj=repositorio.findById(new UsuarioRolId(codusu, codrol)).get();
        repositorio.delete(obj);
        return obj;
    }
}
