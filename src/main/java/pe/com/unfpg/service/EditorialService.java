package pe.com.unfpg.service;

import pe.com.unfpg.entity.EditorialEntity;

import java.util.List;

public interface EditorialService {

    List<EditorialEntity> findAll();
    List<EditorialEntity> findAllCustom();
    EditorialEntity findById(Long id);
    EditorialEntity add(EditorialEntity obj);
    EditorialEntity update(EditorialEntity obj, Long id);
    EditorialEntity delete(Long id);
    EditorialEntity enable(Long id);

}
