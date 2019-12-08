package local.tiendavirtual.controladores;

import java.util.List;
import local.tiendavirtual.modelos.Categoria;
import local.tiendavirtual.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorCategoria {
    
    @Autowired
    private CategoriaRepositorio repositorio;
    
    @GetMapping("/categorias")
    public List<Categoria> listarEmpleados() {
        return repositorio.findAll();
    }
    
    @GetMapping("/categorias/{id}")
    public Categoria buscar(@PathVariable(value = "id") int id) {
        return null;
    }
}