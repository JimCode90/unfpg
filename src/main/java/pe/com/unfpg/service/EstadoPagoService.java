package pe.com.unfpg.service;

import pe.com.unfpg.entity.EstadoPagoEntity;

import java.util.List;

public interface EstadoPagoService {

    List<EstadoPagoEntity> findAll();
    List<EstadoPagoEntity> findAllCustom();
    EstadoPagoEntity findById(Long id);
    EstadoPagoEntity add(EstadoPagoEntity obj);
    EstadoPagoEntity update(EstadoPagoEntity obj, Long id);
    EstadoPagoEntity delete(Long id);
    EstadoPagoEntity enable(Long id);

}
