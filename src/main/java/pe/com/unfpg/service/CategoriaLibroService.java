package pe.com.unfpg.service;

import pe.com.unfpg.entity.CategoriaLibroEntity;

import java.util.List;

public interface CategoriaLibroService {

    List<CategoriaLibroEntity> findAll();
    List<CategoriaLibroEntity> findAllCustom();
    CategoriaLibroEntity findById(Long id);
    CategoriaLibroEntity add(CategoriaLibroEntity obj);
    CategoriaLibroEntity update(CategoriaLibroEntity obj, Long id);
    CategoriaLibroEntity delete(Long id);
    CategoriaLibroEntity enable(Long id);

}
