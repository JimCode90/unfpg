package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.LibroEntity;
import pe.com.unfpg.repository.LibroRepository;
import pe.com.unfpg.service.LibroService;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    private LibroRepository repositorio;

    public LibroServiceImpl(LibroRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<LibroEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<LibroEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public LibroEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public LibroEntity add(LibroEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public LibroEntity update(LibroEntity obj, Long id) {
        LibroEntity objlib = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objlib);
        return repositorio.save(objlib);
    }
    @Override
    public LibroEntity delete(Long id) {
        LibroEntity objlib = repositorio.findById(id).get();
        objlib.setEstado(false);
        return repositorio.save(objlib);
    }
    @Override
    public LibroEntity enable(Long id) {
        LibroEntity objlib = repositorio.findById(id).get();
        objlib.setEstado(true);
        return repositorio.save(objlib);
    }

}
