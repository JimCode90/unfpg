package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.CursoLmsEntity;
import pe.com.unfpg.service.CursoLmsService;

import java.util.List;

@RestController
@RequestMapping("/api/cursolms")
public class CursoLmsRestController {
    @Autowired
    private CursoLmsService servicio;

    @GetMapping
    public List<CursoLmsEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CursoLmsEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public CursoLmsEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CursoLmsEntity add(@RequestBody CursoLmsEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public CursoLmsEntity update(@RequestBody CursoLmsEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public CursoLmsEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public CursoLmsEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
