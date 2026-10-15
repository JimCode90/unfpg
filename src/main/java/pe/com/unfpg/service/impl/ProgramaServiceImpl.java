package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.ProgramaEntity;
import pe.com.unfpg.repository.ProgramaRepository;
import pe.com.unfpg.service.ProgramaService;

import java.util.List;

@Service
public class ProgramaServiceImpl implements ProgramaService {

    private ProgramaRepository repositorio;

    public ProgramaServiceImpl(ProgramaRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<ProgramaEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<ProgramaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public ProgramaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public ProgramaEntity add(ProgramaEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public ProgramaEntity update(ProgramaEntity obj, Long id) {
        ProgramaEntity objprog = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objprog);
        return repositorio.save(objprog);
    }
    @Override
    public ProgramaEntity delete(Long id) {
        ProgramaEntity objprog = repositorio.findById(id).get();
        objprog.setEstado(false);
        return repositorio.save(objprog);
    }
    @Override
    public ProgramaEntity enable(Long id) {
        ProgramaEntity objprog = repositorio.findById(id).get();
        objprog.setEstado(true);
        return repositorio.save(objprog);
    }

}
