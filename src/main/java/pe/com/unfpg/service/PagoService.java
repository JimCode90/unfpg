package pe.com.unfpg.service;

import pe.com.unfpg.entity.PagoEntity;

import java.util.List;

public interface PagoService {

    List<PagoEntity> findAll();
    List<PagoEntity> findAllCustom();
    PagoEntity findById(Long id);
    PagoEntity add(PagoEntity obj);
    PagoEntity update(PagoEntity obj, Long id);
    PagoEntity delete(Long id);
    PagoEntity enable(Long id);
}
