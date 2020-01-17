package local.tiendavirtual.controladores;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import local.tiendavirtual.modelos.Usuario;
import local.tiendavirtual.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorUsuario {
    
    @Autowired
    private UsuarioRepositorio repositorio;
    
    @GetMapping("/usuarios")
    public List<Usuario> listarProductos() {
        return repositorio.findAll();
    }
    
    @PostMapping("/usuarios/agregar")
    public Usuario agregar(@Valid @RequestBody Usuario usuario) {
        return repositorio.save(usuario);
    }
    
    @PutMapping("/usuarios/modificar/{correo}")
    public Usuario actualizar(@PathVariable("correo") String correo,
                              @Valid @RequestBody Usuario usuario) {
        usuario.setCorreo(correo);
        return repositorio.save(usuario);
    }
    
    @GetMapping("/usuarios/buscar/{correo}")
    public Usuario buscar(@PathVariable("correo") String correo) {
        return repositorio.findById(correo + ".").get();
    }
    
    @DeleteMapping("/usuarios/eliminar/{correo}")
    public void eliminar(@PathVariable("correo") String correo) {
        repositorio.deleteById(correo + ".");
    }
}