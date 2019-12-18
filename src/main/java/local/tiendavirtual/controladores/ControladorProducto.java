package local.tiendavirtual.controladores;

import java.util.Comparator;
import java.util.List;
import javax.validation.Valid;
import local.tiendavirtual.modelos.Producto;
import local.tiendavirtual.repositorios.ProductoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
public class ControladorProducto {
    
    @Autowired
    private ProductoRepositorio repositorio;
    
    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }
    
    @PostMapping("/productos")
    public Producto agregar(@Valid @RequestBody Producto producto) {
        return repositorio.save(producto);
    }
    
    @PutMapping("/productos/{id}")
    public Producto actualizar(@Valid @RequestBody Producto producto) {
        return repositorio.save(producto);
    }
    
    @GetMapping("/productos/{id}")
    public Producto buscar(@PathVariable("id") int id) {
    	return repositorio.findById(id).get(); 
    }
    
    @GetMapping("/productos/filtro/{descripcion}")
    public Producto buscarDescripcion(@PathVariable("descripcion") String descripcion) {
    	return repositorio.findAll().stream()
                                    .filter(producto -> producto.getDescripcion()
                                    .equals(descripcion)).findFirst().get();
    }
    
    @DeleteMapping("/productos/{id}")
    public void eliminar(@PathVariable("id") int id) {
        repositorio.deleteById(id);
    }
}