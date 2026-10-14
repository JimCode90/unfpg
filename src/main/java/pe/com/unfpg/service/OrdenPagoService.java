package pe.com.unfpg.service;

import pe.com.unfpg.entity.OrdenPagoEntity;

import java.util.List;

public interface OrdenPagoService {

    List<OrdenPagoEntity> findAll();
    List<OrdenPagoEntity> findAllCustom();
    OrdenPagoEntity findById(Long id);
    OrdenPagoEntity add(OrdenPagoEntity obj);
    OrdenPagoEntity update(OrdenPagoEntity obj, Long id);
    OrdenPagoEntity delete(Long id);
    OrdenPagoEntity enable(Long id);
}
