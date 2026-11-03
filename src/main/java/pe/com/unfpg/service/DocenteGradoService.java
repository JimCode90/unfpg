package pe.com.unfpg.service;

import pe.com.unfpg.entity.DocenteGradoEntity;

import java.util.List;

public interface DocenteGradoService {

    List<DocenteGradoEntity> findAll();
    DocenteGradoEntity findById(Long coddoc, Long codgrai);
    DocenteGradoEntity add(DocenteGradoEntity obj);
    DocenteGradoEntity update(DocenteGradoEntity obj, Long coddoc, Long codgrai);
    DocenteGradoEntity delete(Long coddoc, Long codgrai);
}
