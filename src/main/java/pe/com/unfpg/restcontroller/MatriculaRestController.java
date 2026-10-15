package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.MatriculaEntity;
import pe.com.unfpg.service.MatriculaService;

import java.util.List;

@RestController
@RequestMapping("/api/matricula")
public class MatriculaRestController {
    @Autowired
    private MatriculaService servicio;

    @GetMapping
    public List<MatriculaEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MatriculaEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public MatriculaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public MatriculaEntity add(@RequestBody MatriculaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public MatriculaEntity update(@RequestBody MatriculaEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public MatriculaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public MatriculaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
