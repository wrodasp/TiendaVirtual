package local.tiendavirtual.controladores;

import java.util.List;
import javax.validation.Valid;
import local.tiendavirtual.modelos.Categoria;
import local.tiendavirtual.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorCategoria {

    @Autowired
    private CategoriaRepositorio repositorio;
    
    @GetMapping("/categorias")
    public List<Categoria> listarCategorias() {
        return repositorio.findAll();
    }
    
    @PostMapping("/categorias/agregar")
    public Categoria agregarCategoria(@Valid @RequestBody Categoria categoria) {
        return repositorio.save(categoria);
    }
    
    @GetMapping("/categorias/buscar/{id}")
    public Categoria buscar(@PathVariable("id") int id) {
    	return repositorio.findById(id).orElse(new Categoria(0, "Sin categoría")); 
    }
    
    @DeleteMapping("/categorias/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id) {
        repositorio.deleteById(id);
    }
}