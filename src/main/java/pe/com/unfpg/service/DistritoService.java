package pe.com.unfpg.service;

import pe.com.unfpg.entity.DistritoEntity;

import java.util.List;

public interface DistritoService {
    //declaramos las operaciones con las cuales vamos a trabajar
    //mostrar todos distrito
    List<DistritoEntity> findAll();
    //mostrar los distritos habilitados
    List<DistritoEntity> findAllCustom();
    //buscar distrito por código
    DistritoEntity findById(Long id);
    //registrar distrito
    DistritoEntity add(DistritoEntity obj);
    //actualizar distrito
    DistritoEntity update(DistritoEntity obj, Long id);
    //eliminar distrito
    DistritoEntity delete(Long id);
    //habilitar distrito
    DistritoEntity enable(Long id);

}
