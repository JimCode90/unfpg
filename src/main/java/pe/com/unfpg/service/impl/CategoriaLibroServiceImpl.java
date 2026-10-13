package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CategoriaLibroEntity;
import pe.com.unfpg.repository.CategoriaLibroRepository;
import pe.com.unfpg.service.CategoriaLibroService;

import java.util.List;

@Service
public class CategoriaLibroServiceImpl implements CategoriaLibroService {

    @Autowired
    private CategoriaLibroRepository repositorio;

    @Override
    public List<CategoriaLibroEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<CategoriaLibroEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public CategoriaLibroEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public CategoriaLibroEntity add(CategoriaLibroEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public CategoriaLibroEntity update(CategoriaLibroEntity obj, Long id) {
        CategoriaLibroEntity objcatl = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcatl);
        return repositorio.save(objcatl);
    }
    @Override
    public CategoriaLibroEntity delete(Long id) {
        CategoriaLibroEntity objcatl = repositorio.findById(id).get();
        objcatl.setEstado(false);
        return repositorio.save(objcatl);
    }
    @Override
    public CategoriaLibroEntity enable(Long id) {
        CategoriaLibroEntity objcatl = repositorio.findById(id).get();
        objcatl.setEstado(true);
        return repositorio.save(objcatl);
    }

}
