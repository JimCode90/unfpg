package pe.com.unfpg.service;

import pe.com.unfpg.entity.PrestamoLibroEntity;

import java.util.List;

public interface PrestamoLibroService {

    List<PrestamoLibroEntity> findAll();
    List<PrestamoLibroEntity> findAllCustom();
    PrestamoLibroEntity findById(Long id);
    PrestamoLibroEntity add(PrestamoLibroEntity obj);
    PrestamoLibroEntity update(PrestamoLibroEntity obj, Long id);
    PrestamoLibroEntity delete(Long id);
    PrestamoLibroEntity enable(Long id);
}
