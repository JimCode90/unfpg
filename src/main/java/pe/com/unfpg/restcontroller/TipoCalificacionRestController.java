package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.TipoCalificacionEntity;
import pe.com.unfpg.service.TipoCalificacionService;

import java.util.List;

@RestController
@RequestMapping("/api/tipocalificacion")
public class TipoCalificacionRestController {

    @Autowired
    private TipoCalificacionService servicio;

    @GetMapping
    public List<TipoCalificacionEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoCalificacionEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TipoCalificacionEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TipoCalificacionEntity add(@RequestBody TipoCalificacionEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public TipoCalificacionEntity update(@RequestBody TipoCalificacionEntity obj,
                                          @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public TipoCalificacionEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public TipoCalificacionEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
