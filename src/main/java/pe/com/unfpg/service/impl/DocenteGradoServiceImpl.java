package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.entity.DocenteGradoId;
import pe.com.unfpg.repository.DocenteGradoRepository;
import pe.com.unfpg.service.DocenteGradoService;

import java.util.List;

@Service
public class DocenteGradoServiceImpl implements DocenteGradoService {
    private DocenteGradoRepository repositorio;

    public DocenteGradoServiceImpl(DocenteGradoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<DocenteGradoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public DocenteGradoEntity findById(Long coddoc, Long codgrai) {
        return repositorio.findById(new DocenteGradoId(coddoc, codgrai)).get();
    }
    @Override
    public DocenteGradoEntity add(DocenteGradoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public DocenteGradoEntity update(DocenteGradoEntity obj, Long coddoc, Long codgrai) {
        DocenteGradoEntity objdgr=repositorio.findById(new DocenteGradoId(coddoc, codgrai)).get();
        BeanUtils.copyProperties(obj, objdgr, "id", "docente", "gradoinstruccion");
        return repositorio.save(objdgr);
    }
    @Override
    public DocenteGradoEntity delete(Long coddoc, Long codgrai) {
        DocenteGradoEntity obj=repositorio.findById(new DocenteGradoId(coddoc, codgrai)).get();
        repositorio.delete(obj);
        return obj;
    }
}
