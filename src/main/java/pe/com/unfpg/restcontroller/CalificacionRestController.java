package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.CalificacionEntity;
import pe.com.unfpg.service.CalificacionService;

import java.util.List;

@RestController
@RequestMapping("/api/calificacion")
public class CalificacionRestController {
    @Autowired
    private CalificacionService servicio;

    @GetMapping
    public List<CalificacionEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public CalificacionEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CalificacionEntity add(@RequestBody CalificacionEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public CalificacionEntity update(@RequestBody CalificacionEntity obj,
                                     @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
