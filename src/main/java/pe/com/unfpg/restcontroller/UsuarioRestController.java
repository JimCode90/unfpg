package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.UsuarioEntity;
import pe.com.unfpg.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {
    @Autowired
    private UsuarioService servicio;

    @GetMapping
    public List<UsuarioEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<UsuarioEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public UsuarioEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public UsuarioEntity update(@RequestBody UsuarioEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PatchMapping("/{id}")
    public UsuarioEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
