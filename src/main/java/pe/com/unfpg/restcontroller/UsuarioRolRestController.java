package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.UsuarioRolEntity;
import pe.com.unfpg.service.UsuarioRolService;

import java.util.List;

@RestController
@RequestMapping("/api/usuariorol")
public class UsuarioRolRestController {
    @Autowired
    private UsuarioRolService servicio;

    @GetMapping
    public List<UsuarioRolEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/{codusu}/{codrol}")
    public UsuarioRolEntity findById(@PathVariable Long codusu, @PathVariable Long codrol) {
        return servicio.findById(codusu, codrol);
    }

    @PostMapping
    public UsuarioRolEntity add(@RequestBody UsuarioRolEntity obj) {
        return servicio.add(obj);
    }

    @DeleteMapping("/{codusu}/{codrol}")
    public UsuarioRolEntity delete(@PathVariable Long codusu, @PathVariable Long codrol) {
        return servicio.delete(codusu, codrol);
    }
}
