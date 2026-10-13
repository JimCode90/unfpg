package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EstadoPrestamoLibroEntity;
import pe.com.unfpg.service.EstadoPrestamoLibroService;

import java.util.List;

@RestController
@RequestMapping("/api/estadoprestamolibro")
public class EstadoPrestamoLibroRestController {

    @Autowired
    private EstadoPrestamoLibroService servicio;

    @GetMapping
    public List<EstadoPrestamoLibroEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstadoPrestamoLibroEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EstadoPrestamoLibroEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EstadoPrestamoLibroEntity add(@RequestBody EstadoPrestamoLibroEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EstadoPrestamoLibroEntity update(@RequestBody EstadoPrestamoLibroEntity obj,
                                            @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EstadoPrestamoLibroEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EstadoPrestamoLibroEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
