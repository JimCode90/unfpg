package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.EmpleadoGradoEntity;
import pe.com.unfpg.service.EmpleadoGradoService;

import java.util.List;

@RestController
@RequestMapping("/api/empleadogrado")
public class EmpleadoGradoRestController {
    @Autowired
    private EmpleadoGradoService servicio;

    @GetMapping
    public List<EmpleadoGradoEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{codemp}/{codgrai}")
    public EmpleadoGradoEntity findById(@PathVariable Long codemp, @PathVariable Long codgrai) {
        return servicio.findById(codemp, codgrai);
    }

    @PostMapping
    public EmpleadoGradoEntity add(@RequestBody EmpleadoGradoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{codemp}/{codgrai}")
    public EmpleadoGradoEntity update(@RequestBody EmpleadoGradoEntity obj,
                               @PathVariable Long codemp, @PathVariable Long codgrai) {
        return servicio.update(obj, codemp, codgrai);
    }
}
