package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.HorarioEntity;
import pe.com.unfpg.service.HorarioService;

import java.util.List;

@RestController
@RequestMapping("/api/horario")
public class HorarioRestController {
    @Autowired
    private HorarioService servicio;

    @GetMapping
    public List<HorarioEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public HorarioEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public HorarioEntity add(@RequestBody HorarioEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public HorarioEntity update(@RequestBody HorarioEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }
}
