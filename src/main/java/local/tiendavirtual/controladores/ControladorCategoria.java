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
/**
 * Atributos de la Clase ControladorCategoria 
 */
    @Autowired
    private CategoriaRepositorio repositorio;
    /**
     * Metodo para listar las Categorias
     * @return Retorna una lista de Categorias
     */
    @GetMapping("/categorias")
    public List<Categoria> listarCategorias() {
        return repositorio.findAll();
    }
    /**
     * Metodo para agregar una nueva Categoria
     * @param categoria Recibe un atributo de tipo categoria 
     * @return Retorna la respuesta si se agrego a la base de datos
     */
    @PostMapping("/categorias/agregar")
    public Categoria agregarCategoria(@Valid @RequestBody Categoria categoria) {
        return repositorio.save(categoria);
    }
    /**
     * Metodo para Buscar la categoria
     * @param id Recibe la id de la categoria 
     * @return retorna una categoria si existe o un sin categoria en el caso de no exitir
     */
    @GetMapping("/categorias/buscar/{id}")
    public Categoria buscar(@PathVariable("id") int id) {
    	return repositorio.findById(id).orElse(new Categoria(0, "Sin categoría")); 
    }
    /**
     * Metodo para eliminar la categoria
     * @param id Recibe la id de la categoria a eliminar 
     */
    @DeleteMapping("/categorias/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id) {
        repositorio.deleteById(id);
    }
}