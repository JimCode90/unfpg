package pe.com.unfpg.service;

import pe.com.unfpg.entity.ConceptoPagoEntity;

import java.util.List;

public interface ConceptoPagoService {

    List<ConceptoPagoEntity> findAll();
    List<ConceptoPagoEntity> findAllCustom();
    ConceptoPagoEntity findById(Long id);
    ConceptoPagoEntity add(ConceptoPagoEntity obj);
    ConceptoPagoEntity update(ConceptoPagoEntity obj, Long id);
    ConceptoPagoEntity delete(Long id);
    ConceptoPagoEntity enable(Long id);

}
