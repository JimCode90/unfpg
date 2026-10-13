package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EstadoPagoEntity;
import pe.com.unfpg.service.EstadoPagoService;

import java.util.List;

@RestController
@RequestMapping("/api/estadopago")
public class EstadoPagoRestController {

    @Autowired
    private EstadoPagoService servicio;

    @GetMapping
    public List<EstadoPagoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstadoPagoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EstadoPagoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EstadoPagoEntity add(@RequestBody EstadoPagoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EstadoPagoEntity update(@RequestBody EstadoPagoEntity obj,
                                   @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EstadoPagoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EstadoPagoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
