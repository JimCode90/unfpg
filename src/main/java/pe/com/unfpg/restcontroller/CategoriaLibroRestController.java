package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.CategoriaLibroEntity;
import pe.com.unfpg.service.CategoriaLibroService;

import java.util.List;

@RestController
@RequestMapping("/api/categorialibro")
public class CategoriaLibroRestController {

    @Autowired
    private CategoriaLibroService servicio;

    @GetMapping
    public List<CategoriaLibroEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CategoriaLibroEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public CategoriaLibroEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CategoriaLibroEntity add(@RequestBody CategoriaLibroEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public CategoriaLibroEntity update(@RequestBody CategoriaLibroEntity obj,
                                       @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public CategoriaLibroEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public CategoriaLibroEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
