package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.MetodoPagoEntity;
import pe.com.unfpg.service.MetodoPagoService;

import java.util.List;

@RestController
@RequestMapping("/api/metodopago")
public class MetodoPagoRestController {

    @Autowired
    private MetodoPagoService servicio;

    @GetMapping
    public List<MetodoPagoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MetodoPagoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public MetodoPagoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public MetodoPagoEntity add(@RequestBody MetodoPagoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public MetodoPagoEntity update(@RequestBody MetodoPagoEntity obj,
                                   @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public MetodoPagoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public MetodoPagoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
