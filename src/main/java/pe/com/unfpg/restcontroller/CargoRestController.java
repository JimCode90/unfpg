package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.CargoEntity;
import pe.com.unfpg.service.CargoService;

import java.util.List;

@RestController
@RequestMapping("/api/cargo")
public class CargoRestController {

    @Autowired
    private CargoService servicio;

    @GetMapping
    public List<CargoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CargoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public CargoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CargoEntity add(@RequestBody CargoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public CargoEntity update(@RequestBody CargoEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public CargoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public CargoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
