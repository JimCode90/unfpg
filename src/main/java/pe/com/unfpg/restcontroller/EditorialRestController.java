package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EditorialEntity;
import pe.com.unfpg.service.EditorialService;

import java.util.List;

@RestController
@RequestMapping("/api/editorial")
public class EditorialRestController {

    @Autowired
    private EditorialService servicio;

    @GetMapping
    public List<EditorialEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EditorialEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EditorialEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EditorialEntity add(@RequestBody EditorialEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EditorialEntity update(@RequestBody EditorialEntity obj,
                                  @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EditorialEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EditorialEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
