package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EstadoCivilEntity;
import pe.com.unfpg.service.EstadoCivilService;

import java.util.List;

@RestController
@RequestMapping("/api/estadocivil")
public class EstadoCivilRestController {

    @Autowired
    private EstadoCivilService servicio;

    @GetMapping
    public List<EstadoCivilEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstadoCivilEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EstadoCivilEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EstadoCivilEntity add(@RequestBody EstadoCivilEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EstadoCivilEntity update(@RequestBody EstadoCivilEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EstadoCivilEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EstadoCivilEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
