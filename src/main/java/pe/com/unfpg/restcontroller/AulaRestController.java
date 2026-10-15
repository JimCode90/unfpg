package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.AulaEntity;
import pe.com.unfpg.service.AulaService;

import java.util.List;

@RestController
@RequestMapping("/api/aula")
public class AulaRestController {
    @Autowired
    private AulaService servicio;

    @GetMapping
    public List<AulaEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public AulaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public AulaEntity add(@RequestBody AulaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public AulaEntity update(@RequestBody AulaEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
