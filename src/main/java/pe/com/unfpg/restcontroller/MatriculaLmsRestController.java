package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.MatriculaLmsEntity;
import pe.com.unfpg.service.MatriculaLmsService;

import java.util.List;

@RestController
@RequestMapping("/api/matriculalms")
public class MatriculaLmsRestController {
    @Autowired
    private MatriculaLmsService servicio;

    @GetMapping
    public List<MatriculaLmsEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MatriculaLmsEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public MatriculaLmsEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public MatriculaLmsEntity add(@RequestBody MatriculaLmsEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public MatriculaLmsEntity update(@RequestBody MatriculaLmsEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public MatriculaLmsEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public MatriculaLmsEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
