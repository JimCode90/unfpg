package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.TipoMatriculaEntity;
import pe.com.unfpg.service.TipoMatriculaService;

import java.util.List;

@RestController
@RequestMapping("/api/tipomatricula")
public class TipoMatriculaRestController {

    @Autowired
    private TipoMatriculaService servicio;

    @GetMapping
    public List<TipoMatriculaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoMatriculaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TipoMatriculaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TipoMatriculaEntity add(@RequestBody TipoMatriculaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public TipoMatriculaEntity update(@RequestBody TipoMatriculaEntity obj,
                                      @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public TipoMatriculaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public TipoMatriculaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
