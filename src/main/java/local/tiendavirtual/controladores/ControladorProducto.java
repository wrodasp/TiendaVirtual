package local.tiendavirtual.controladores;
import java.util.List;
import javax.validation.Valid;
import local.tiendavirtual.modelos.Producto;
import local.tiendavirtual.repositorios.ProductoRepositorio;
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
public class ControladorProducto {
    /**
     * Atributos de la Clase ControladorProducto
     */
    @Autowired
    private ProductoRepositorio repositorio;
    /**
     * Metodo para listar los productos
     * @return Retorna una lista con todos los Productos
     */
    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }
    /**
     * Metodo para agregar Producto
     * @param producto Recibe un atributo de tipo pruducto
     * @return Retorna si se a agregado el producto
     */
    @PostMapping("/productos/agregar")
    public Producto agregar(@Valid @RequestBody Producto producto) {
        return repositorio.save(producto);
    }
    /**
     * Metodo para actualizar el producto
     * @param id Identificador del producto
     * @param producto El producto a ser modificado
     * @return Retorna si se a guardo los cambios
     */
    @PutMapping("/productos/modificar/{id}")
    public Producto actualizar(@PathVariable("id") int id, @Valid @RequestBody Producto producto) {
        return repositorio.save(producto);
    }
    /**
     * Metodo para buscar producto
     * @param id Identificador del Producto
     * @return retorna el producto buscado por la id
     */
    @GetMapping("/productos/buscar/{id}")
    public Producto buscar(@PathVariable("id") int id) {
    	return repositorio.findById(id).get(); 
    }
    /**
     * Metodo de busqueda de producto 
     * @param descripcion Recibe la descripcion para la busqueda
     * @return Retorna un Producto 
     */
    @GetMapping("/productos/filtro/{descripcion}")
    public Producto buscarDescripcion(@PathVariable("descripcion") String descripcion) {
    	return repositorio.findAll().stream()
                                    .filter(producto -> producto.getDescripcion()
                                    .equals(descripcion)).findFirst().get();
    }
    /**
     *Metodo para eliminar producto 
     * @param id Recibe el identificador del producto a eliminar
     */
    @DeleteMapping("/productos/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id) {
        repositorio.deleteById(id);
    }
}