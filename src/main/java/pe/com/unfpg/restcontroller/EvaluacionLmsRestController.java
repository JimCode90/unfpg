package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EvaluacionLmsEntity;
import pe.com.unfpg.service.EvaluacionLmsService;

import java.util.List;

@RestController
@RequestMapping("/api/evaluacionlms")
public class EvaluacionLmsRestController {
    @Autowired
    private EvaluacionLmsService servicio;

    @GetMapping
    public List<EvaluacionLmsEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EvaluacionLmsEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EvaluacionLmsEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EvaluacionLmsEntity add(@RequestBody EvaluacionLmsEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public EvaluacionLmsEntity update(@RequestBody EvaluacionLmsEntity obj,
                               @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public EvaluacionLmsEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public EvaluacionLmsEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
