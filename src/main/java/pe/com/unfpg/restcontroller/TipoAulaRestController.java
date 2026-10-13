package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.TipoAulaEntity;
import pe.com.unfpg.service.TipoAulaService;

import java.util.List;

@RestController
@RequestMapping("/api/tipoaula")
public class TipoAulaRestController {

    @Autowired
    private TipoAulaService servicio;

    @GetMapping
    public List<TipoAulaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoAulaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TipoAulaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TipoAulaEntity add(@RequestBody TipoAulaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public TipoAulaEntity update(@RequestBody TipoAulaEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public TipoAulaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public TipoAulaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
