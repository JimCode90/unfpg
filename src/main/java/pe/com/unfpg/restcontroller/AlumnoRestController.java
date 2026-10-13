package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.AlumnoEntity;
import pe.com.unfpg.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoRestController {
    @Autowired
    private AlumnoService servicio;

    @GetMapping
    public List<AlumnoEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<AlumnoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public AlumnoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public AlumnoEntity add(@RequestBody AlumnoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public AlumnoEntity update(@RequestBody AlumnoEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public AlumnoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public AlumnoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
