package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.CursoEntity;
import pe.com.unfpg.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoRestController {

    @Autowired
    private CursoService servicio;

    @GetMapping
    public List<CursoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public CursoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CursoEntity add(@RequestBody CursoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public CursoEntity update(@RequestBody CursoEntity obj,
                              @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
