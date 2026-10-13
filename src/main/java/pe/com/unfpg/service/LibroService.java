package pe.com.unfpg.service;

import pe.com.unfpg.entity.LibroEntity;

import java.util.List;

public interface LibroService {

    List<LibroEntity> findAll();
    List<LibroEntity> findAllCustom();
    LibroEntity findById(Long id);
    LibroEntity add(LibroEntity obj);
    LibroEntity update(LibroEntity obj, Long id);
    LibroEntity delete(Long id);
    LibroEntity enable(Long id);

}
