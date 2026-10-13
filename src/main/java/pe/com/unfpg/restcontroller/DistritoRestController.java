package pe.com.unfpg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.unfpg.entity.DistritoEntity;
import pe.com.unfpg.service.DistritoService;

import java.util.List;

//servicio RESTful
@RestController
//definir la ruta
@RequestMapping("/api/distrito")
public class DistritoRestController {
    //inyección de dependencias hacia el servicio
    @Autowired
    private DistritoService servicio;

    //Consultas o búsquedas -> @GetMapping
    //mostrar todos los distritos
    @GetMapping
    public List<DistritoEntity> findAll(){
        return servicio.findAll();
    }

    //mostrar los distritos habilitados
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    //buscar distrito por código
    //{id} -> variable de ruta
    @GetMapping("/{id}")
    public DistritoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    //registrar -> @PostMapping
    //registrar distrito
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity obj) {
        return servicio.add(obj);
    }

    //actualizar -> @PutMapping
    //registrar distrito
    @PutMapping("/{id}")
    public DistritoEntity update(@RequestBody DistritoEntity obj,
                                 @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    //eliminar -> @DeleteMapping
    //registrar distrito
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    //habilitar -> actualizar parcial -> @PatchMapping
    //eliminar -> @DeleteMapping
    //registrar distrito
    @PatchMapping("/{id}")
    public DistritoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
