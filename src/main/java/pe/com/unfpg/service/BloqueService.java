package pe.com.unfpg.service;

import pe.com.unfpg.entity.BloqueEntity;

import java.util.List;

public interface BloqueService {
    List<BloqueEntity> findAll();
    List<BloqueEntity> findAllCustom();
    BloqueEntity findById(Long id);
    BloqueEntity add(BloqueEntity obj);
    BloqueEntity update(BloqueEntity obj, Long id);
    BloqueEntity delete(Long id);
    BloqueEntity enable(Long id);
}
