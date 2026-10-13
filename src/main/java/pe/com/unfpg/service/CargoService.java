package pe.com.unfpg.service;

import pe.com.unfpg.entity.CargoEntity;

import java.util.List;

public interface CargoService {
    List<CargoEntity> findAll();
    List<CargoEntity> findAllCustom();
    CargoEntity findById(Long id);
    CargoEntity add(CargoEntity obj);
    CargoEntity update(CargoEntity obj, Long id);
    CargoEntity delete(Long id);
    CargoEntity enable(Long id);
}
