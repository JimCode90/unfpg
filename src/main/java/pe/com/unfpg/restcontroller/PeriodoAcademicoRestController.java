package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.PeriodoAcademicoEntity;
import pe.com.unfpg.service.PeriodoAcademicoService;

import java.util.List;

@RestController
@RequestMapping("/api/periodoacademico")
public class PeriodoAcademicoRestController {

    @Autowired
    private PeriodoAcademicoService servicio;

    @GetMapping
    public List<PeriodoAcademicoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<PeriodoAcademicoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public PeriodoAcademicoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public PeriodoAcademicoEntity add(@RequestBody PeriodoAcademicoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public PeriodoAcademicoEntity update(@RequestBody PeriodoAcademicoEntity obj,
                                         @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public PeriodoAcademicoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public PeriodoAcademicoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
