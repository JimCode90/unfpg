package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.GradoInstruccionEntity;
import pe.com.unfpg.service.GradoInstruccionService;

import java.util.List;

@RestController
@RequestMapping("/api/gradoinstruccion")
public class GradoInstruccionRestController {

    @Autowired
    private GradoInstruccionService servicio;

    @GetMapping
    public List<GradoInstruccionEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<GradoInstruccionEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public GradoInstruccionEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public GradoInstruccionEntity add(@RequestBody GradoInstruccionEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public GradoInstruccionEntity update(@RequestBody GradoInstruccionEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public GradoInstruccionEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public GradoInstruccionEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
