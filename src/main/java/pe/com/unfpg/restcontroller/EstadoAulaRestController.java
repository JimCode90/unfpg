package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EstadoAulaEntity;
import pe.com.unfpg.service.EstadoAulaService;

import java.util.List;

@RestController
@RequestMapping("/api/estadoaula")
public class EstadoAulaRestController {

    @Autowired
    private EstadoAulaService servicio;

    @GetMapping
    public List<EstadoAulaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstadoAulaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EstadoAulaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EstadoAulaEntity add(@RequestBody EstadoAulaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EstadoAulaEntity update(@RequestBody EstadoAulaEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EstadoAulaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EstadoAulaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
