package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CargoEntity;
import pe.com.unfpg.repository.CargoRepository;
import pe.com.unfpg.service.CargoService;

import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepository repositorio;

    @Override
    public List<CargoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<CargoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public CargoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public CargoEntity add(CargoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public CargoEntity update(CargoEntity obj, Long id) {
        CargoEntity objcar=repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcar);
        return repositorio.save(objcar);
    }
    @Override
    public CargoEntity delete(Long id) {
        CargoEntity objcar=repositorio.findById(id).get();
        objcar.setEstado(false);
        return repositorio.save(objcar);
    }
    @Override
    public CargoEntity enable(Long id) {
        CargoEntity objcar=repositorio.findById(id).get();
        objcar.setEstado(true);
        return repositorio.save(objcar);
    }
}
