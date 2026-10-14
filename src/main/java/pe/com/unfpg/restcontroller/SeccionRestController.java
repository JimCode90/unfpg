package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.SeccionEntity;
import pe.com.unfpg.service.SeccionService;

import java.util.List;

@RestController
@RequestMapping("/api/seccion")
public class SeccionRestController {
    @Autowired
    private SeccionService servicio;

    @GetMapping
    public List<SeccionEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public SeccionEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public SeccionEntity add(@RequestBody SeccionEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public SeccionEntity update(@RequestBody SeccionEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
