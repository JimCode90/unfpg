package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.DetalleMatriculaEntity;
import pe.com.unfpg.service.DetalleMatriculaService;

import java.util.List;

@RestController
@RequestMapping("/api/detallematricula")
public class DetalleMatriculaRestController {
    @Autowired
    private DetalleMatriculaService servicio;

    @GetMapping
    public List<DetalleMatriculaEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<DetalleMatriculaEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public DetalleMatriculaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DetalleMatriculaEntity add(@RequestBody DetalleMatriculaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public DetalleMatriculaEntity update(@RequestBody DetalleMatriculaEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public DetalleMatriculaEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public DetalleMatriculaEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
