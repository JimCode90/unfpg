package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.RolLmsEntity;
import pe.com.unfpg.service.RolLmsService;

import java.util.List;

@RestController
@RequestMapping("/api/rollms")
public class RolLmsRestController {

    @Autowired
    private RolLmsService servicio;

    @GetMapping
    public List<RolLmsEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<RolLmsEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public RolLmsEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public RolLmsEntity add(@RequestBody RolLmsEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public RolLmsEntity update(@RequestBody RolLmsEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public RolLmsEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public RolLmsEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
