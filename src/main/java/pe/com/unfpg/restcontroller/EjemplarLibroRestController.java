package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EjemplarLibroEntity;
import pe.com.unfpg.service.EjemplarLibroService;

import java.util.List;

@RestController
@RequestMapping("/api/ejemplarlibro")
public class EjemplarLibroRestController {
    @Autowired
    private EjemplarLibroService servicio;

    @GetMapping
    public List<EjemplarLibroEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EjemplarLibroEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EjemplarLibroEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EjemplarLibroEntity add(@RequestBody EjemplarLibroEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EjemplarLibroEntity update(@RequestBody EjemplarLibroEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EjemplarLibroEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EjemplarLibroEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
