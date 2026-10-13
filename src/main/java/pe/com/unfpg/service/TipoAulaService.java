package pe.com.unfpg.service;

import pe.com.unfpg.entity.TipoAulaEntity;

import java.util.List;

public interface TipoAulaService {
    List<TipoAulaEntity> findAll();
    List<TipoAulaEntity> findAllCustom();
    TipoAulaEntity findById(Long id);
    TipoAulaEntity add(TipoAulaEntity obj);
    TipoAulaEntity update(TipoAulaEntity obj, Long id);
    TipoAulaEntity delete(Long id);
    TipoAulaEntity enable(Long id);
}
