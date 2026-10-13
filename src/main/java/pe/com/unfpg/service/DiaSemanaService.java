package pe.com.unfpg.service;

import pe.com.unfpg.entity.DiaSemanaEntity;

import java.util.List;

public interface DiaSemanaService {
    List<DiaSemanaEntity> findAll();
    List<DiaSemanaEntity> findAllCustom();
    DiaSemanaEntity findById(Long id);
    DiaSemanaEntity add(DiaSemanaEntity obj);
    DiaSemanaEntity update(DiaSemanaEntity obj, Long id);
    DiaSemanaEntity delete(Long id);
    DiaSemanaEntity enable(Long id);
}
