package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.service.DocenteGradoService;

import java.util.List;

@RestController
@RequestMapping("/api/docentegrado")
public class DocenteGradoRestController {
    @Autowired
    private DocenteGradoService servicio;

    @GetMapping
    public List<DocenteGradoEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{coddoc}/{codgrai}")
    public DocenteGradoEntity findById(@PathVariable Long coddoc, @PathVariable Long codgrai) {
        return servicio.findById(coddoc, codgrai);
    }

    @PostMapping
    public DocenteGradoEntity add(@RequestBody DocenteGradoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{coddoc}/{codgrai}")
    public DocenteGradoEntity update(@RequestBody DocenteGradoEntity obj,
                               @PathVariable Long coddoc, @PathVariable Long codgrai) {
        return servicio.update(obj, coddoc, codgrai);
    }

    @DeleteMapping("/{coddoc}/{codgrai}")
    public DocenteGradoEntity delete(@PathVariable Long coddoc, @PathVariable Long codgrai) {
        return servicio.delete(coddoc, codgrai);
    }
}
