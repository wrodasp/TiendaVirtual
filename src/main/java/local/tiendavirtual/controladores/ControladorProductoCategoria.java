package local.tiendavirtual.controladores;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import local.tiendavirtual.modelos.ProductoCategoria;
import local.tiendavirtual.repositorios.ProductoCategoriaRepositorio;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorProductoCategoria {
	@Autowired
    private ProductoCategoriaRepositorio repositorio;
	 @GetMapping("/productos_categorias")
	    public List<ProductoCategoria> listarCategoriasProductos() {
	        return repositorio.findAll();
	    }
	
	 @PostMapping("/productos_categorias")
	    public ProductoCategoria agregarProductoCategoria(@Valid @RequestBody ProductoCategoria productoCategoria) {
		 	System.out.println(productoCategoria.getProducto_id());
	        return repositorio.save(productoCategoria);
	    }
}
