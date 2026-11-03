package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EmpleadoGradoEntity;
import pe.com.unfpg.entity.EmpleadoGradoId;
import pe.com.unfpg.repository.EmpleadoGradoRepository;
import pe.com.unfpg.service.EmpleadoGradoService;

import java.util.List;

@Service
public class EmpleadoGradoServiceImpl implements EmpleadoGradoService {
    private EmpleadoGradoRepository repositorio;

    public EmpleadoGradoServiceImpl(EmpleadoGradoRepository repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public List<EmpleadoGradoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public EmpleadoGradoEntity findById(Long codemp, Long codgrai) {
        return repositorio.findById(new EmpleadoGradoId(codemp, codgrai)).get();
    }
    @Override
    public EmpleadoGradoEntity add(EmpleadoGradoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public EmpleadoGradoEntity update(EmpleadoGradoEntity obj, Long codemp, Long codgrai) {
        EmpleadoGradoEntity objegr=repositorio.findById(new EmpleadoGradoId(codemp, codgrai)).get();
        BeanUtils.copyProperties(obj, objegr, "id", "empleado", "gradoinstruccion");
        return repositorio.save(objegr);
    }
}
