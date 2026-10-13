package pe.com.unfpg.service;

import pe.com.unfpg.entity.UbicacionEntity;

import java.util.List;

public interface UbicacionService {
    List<UbicacionEntity> findAll();
    List<UbicacionEntity> findAllCustom();
    UbicacionEntity findById(Long id);
    UbicacionEntity add(UbicacionEntity obj);
    UbicacionEntity update(UbicacionEntity obj, Long id);
    UbicacionEntity delete(Long id);
    UbicacionEntity enable(Long id);
}
