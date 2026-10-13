package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.BloqueEntity;
import pe.com.unfpg.service.BloqueService;

import java.util.List;

@RestController
@RequestMapping("/api/bloque")
public class BloqueRestController {

    @Autowired
    private BloqueService servicio;

    @GetMapping
    public List<BloqueEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<BloqueEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public BloqueEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public BloqueEntity add(@RequestBody BloqueEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public BloqueEntity update(@RequestBody BloqueEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public BloqueEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public BloqueEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
