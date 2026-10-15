package pe.com.unfpg.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.ConceptoPagoEntity;
import pe.com.unfpg.repository.ConceptoPagoRepository;
import pe.com.unfpg.service.ConceptoPagoService;

import java.util.List;

@Service
public class ConceptoPagoServiceImpl implements ConceptoPagoService {

    @Autowired
    private ConceptoPagoRepository repositorio;

    @Override
    public List<ConceptoPagoEntity> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<ConceptoPagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    @Override
    public ConceptoPagoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public ConceptoPagoEntity add(ConceptoPagoEntity obj) {
        return repositorio.save(obj);
    }
    @Override
    public ConceptoPagoEntity update(ConceptoPagoEntity obj, Long id) {
        ConceptoPagoEntity objconp = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objconp);
        return repositorio.save(objconp);
    }
    @Override
    public ConceptoPagoEntity delete(Long id) {
        ConceptoPagoEntity objconp = repositorio.findById(id).get();
        objconp.setEstado(false);
        return repositorio.save(objconp);
    }
    @Override
    public ConceptoPagoEntity enable(Long id) {
        ConceptoPagoEntity objconp = repositorio.findById(id).get();
        objconp.setEstado(true);
        return repositorio.save(objconp);
    }

}
