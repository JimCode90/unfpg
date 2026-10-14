package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.AsistenciaEntity;
import pe.com.unfpg.service.AsistenciaService;

import java.util.List;

@RestController
@RequestMapping("/api/asistencia")
public class AsistenciaRestController {
    @Autowired
    private AsistenciaService servicio;

    @GetMapping
    public List<AsistenciaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public AsistenciaEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public AsistenciaEntity add(@RequestBody AsistenciaEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public AsistenciaEntity update(@RequestBody AsistenciaEntity obj,
                                   @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
