package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.DiaSemanaEntity;
import pe.com.unfpg.service.DiaSemanaService;

import java.util.List;

@RestController
@RequestMapping("/api/diasemana")
public class DiaSemanaRestController {

    @Autowired
    private DiaSemanaService servicio;

    @GetMapping
    public List<DiaSemanaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<DiaSemanaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public DiaSemanaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DiaSemanaEntity add(@RequestBody DiaSemanaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public DiaSemanaEntity update(@RequestBody DiaSemanaEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public DiaSemanaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public DiaSemanaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
