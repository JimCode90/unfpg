package pe.com.unfpg.service;

import pe.com.unfpg.entity.EstadoPrestamoLibroEntity;

import java.util.List;

public interface EstadoPrestamoLibroService {

    List<EstadoPrestamoLibroEntity> findAll();
    List<EstadoPrestamoLibroEntity> findAllCustom();
    EstadoPrestamoLibroEntity findById(Long id);
    EstadoPrestamoLibroEntity add(EstadoPrestamoLibroEntity obj);
    EstadoPrestamoLibroEntity update(EstadoPrestamoLibroEntity obj, Long id);
    EstadoPrestamoLibroEntity delete(Long id);
    EstadoPrestamoLibroEntity enable(Long id);

}
