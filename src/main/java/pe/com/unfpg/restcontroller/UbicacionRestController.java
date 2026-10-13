package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.UbicacionEntity;
import pe.com.unfpg.service.UbicacionService;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion")
public class UbicacionRestController {

    @Autowired
    private UbicacionService servicio;

    @GetMapping
    public List<UbicacionEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<UbicacionEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public UbicacionEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public UbicacionEntity add(@RequestBody UbicacionEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public UbicacionEntity update(@RequestBody UbicacionEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public UbicacionEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public UbicacionEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
