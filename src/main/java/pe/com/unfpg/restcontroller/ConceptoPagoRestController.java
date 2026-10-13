package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.ConceptoPagoEntity;
import pe.com.unfpg.service.ConceptoPagoService;

import java.util.List;

@RestController
@RequestMapping("/api/conceptopago")
public class ConceptoPagoRestController {

    @Autowired
    private ConceptoPagoService servicio;

    @GetMapping
    public List<ConceptoPagoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ConceptoPagoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ConceptoPagoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ConceptoPagoEntity add(@RequestBody ConceptoPagoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public ConceptoPagoEntity update(@RequestBody ConceptoPagoEntity obj,
                                     @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public ConceptoPagoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public ConceptoPagoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
