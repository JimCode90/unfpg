package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.FacultadEntity;
import pe.com.unfpg.service.FacultadService;

import java.util.List;

@RestController
@RequestMapping("/api/facultad")
public class FacultadRestController {

    @Autowired
    private FacultadService servicio;

    @GetMapping
    public List<FacultadEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<FacultadEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public FacultadEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public FacultadEntity add(@RequestBody FacultadEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public FacultadEntity update(@RequestBody FacultadEntity obj,
                                 @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public FacultadEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public FacultadEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
