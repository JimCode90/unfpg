package pe.com.unfpg.service;

import pe.com.unfpg.entity.MetodoPagoEntity;

import java.util.List;

public interface MetodoPagoService {

    List<MetodoPagoEntity> findAll();
    List<MetodoPagoEntity> findAllCustom();
    MetodoPagoEntity findById(Long id);
    MetodoPagoEntity add(MetodoPagoEntity obj);
    MetodoPagoEntity update(MetodoPagoEntity obj, Long id);
    MetodoPagoEntity delete(Long id);
    MetodoPagoEntity enable(Long id);

}
