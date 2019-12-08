package local.tiendavirtual.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import local.tiendavirtual.modelos.Producto;

import local.tiendavirtual.repositorios.ProductoRepositorio;

public class ControladorProducto {
	@Autowired
    private ProductoRepositorio repositorio;
    
    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }
    
    @PostMapping("/productos")
    public Producto agregarProductos(@Valid @RequestBody Producto producto) {
        return repositorio.save(producto);
    }
    
    @DeleteMapping("/productos/{id}")
    public void eliminar(@PathVariable("id") int id) {
        repositorio.deleteById(id);
    }
}
