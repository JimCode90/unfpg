package pe.com.unfpg.service;

import pe.com.unfpg.entity.UsuarioRolEntity;

import java.util.List;

public interface UsuarioRolService {

    List<UsuarioRolEntity> findAll();
    UsuarioRolEntity findById(Long codusu, Long codrol);
    UsuarioRolEntity add(UsuarioRolEntity obj);
}
