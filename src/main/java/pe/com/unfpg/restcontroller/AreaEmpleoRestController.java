package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.AreaEmpleoEntity;
import pe.com.unfpg.service.AreaEmpleoService;

import java.util.List;

@RestController
@RequestMapping("/api/areaempleo")
public class AreaEmpleoRestController {

    @Autowired
    private AreaEmpleoService servicio;

    @GetMapping
    public List<AreaEmpleoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<AreaEmpleoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public AreaEmpleoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public AreaEmpleoEntity add(@RequestBody AreaEmpleoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public AreaEmpleoEntity update(@RequestBody AreaEmpleoEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public AreaEmpleoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public AreaEmpleoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
