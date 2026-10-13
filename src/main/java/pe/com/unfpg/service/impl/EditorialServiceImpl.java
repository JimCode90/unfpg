package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EditorialEntity;
import pe.com.unfpg.repository.EditorialRepository;
import pe.com.unfpg.service.EditorialService;

import java.util.List;

@Service
public class EditorialServiceImpl implements EditorialService {

    @Autowired
    private EditorialRepository repositorio;

    @Override
    public List<EditorialEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<EditorialEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public EditorialEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public EditorialEntity add(EditorialEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EditorialEntity update(EditorialEntity obj, Long id) {
        EditorialEntity objedi = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objedi);
        return repositorio.save(objedi);
    }
    @Override
    public EditorialEntity delete(Long id) {
        EditorialEntity objedi = repositorio.findById(id).get();
        objedi.setEstado(false);
        return repositorio.save(objedi);
    }
    @Override
    public EditorialEntity enable(Long id) {
        EditorialEntity objedi = repositorio.findById(id).get();
        objedi.setEstado(true);
        return repositorio.save(objedi);
    }

}
