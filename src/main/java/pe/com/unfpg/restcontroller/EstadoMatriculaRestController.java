package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EstadoMatriculaEntity;
import pe.com.unfpg.service.EstadoMatriculaService;

import java.util.List;

@RestController
@RequestMapping("/api/estadomatricula")
public class EstadoMatriculaRestController {

    @Autowired
    private EstadoMatriculaService servicio;

    @GetMapping
    public List<EstadoMatriculaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstadoMatriculaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EstadoMatriculaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EstadoMatriculaEntity add(@RequestBody EstadoMatriculaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EstadoMatriculaEntity update(@RequestBody EstadoMatriculaEntity obj,
                                        @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EstadoMatriculaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EstadoMatriculaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
