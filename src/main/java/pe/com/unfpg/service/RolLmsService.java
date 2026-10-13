package pe.com.unfpg.service;

import pe.com.unfpg.entity.RolLmsEntity;

import java.util.List;

public interface RolLmsService {

    List<RolLmsEntity> findAll();
    List<RolLmsEntity> findAllCustom();
    RolLmsEntity findById(Long id);
    RolLmsEntity add(RolLmsEntity obj);
    RolLmsEntity update(RolLmsEntity obj, Long id);
    RolLmsEntity delete(Long id);
    RolLmsEntity enable(Long id);

}
