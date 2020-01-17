package local.tiendavirtual.controladores;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.Valid;
import local.tiendavirtual.modelos.Compra;
import local.tiendavirtual.repositorios.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorCompra {
    
    @Autowired
    private CompraRepositorio repositorio;
    
    @PersistenceContext
    private EntityManager entity;
    
    @GetMapping("/compras")
    public List<Compra> listarCompras() {
        return repositorio.findAll();
    }
    
    @PostMapping("/compras/agregar")
    public Compra agregar(@Valid @RequestBody Compra compra) {
        return repositorio.save(compra);
    }
    
    @GetMapping("/compras/masVendidos")
    public List<Object[]> listarProductosMasVendidos() {
        Query consulta = entity.createNativeQuery("select p.id, p.descripcion, sum(c.cantidad) " +
                                                  "from compras as c, productos as p " +
                                                  "where c.producto_id = p.id " +
                                                  "group by p.id, p.descripcion " +
                                                  "order by sum(c.cantidad) desc " +
                                                  "limit 5");
        return consulta.getResultList();
    }
    
    @GetMapping("/compras/masVotados")
    public List<Object[]> listarProductosMasVotados() {
        Query consulta = entity.createNativeQuery("select p.descripcion, p.votos " +
                                                  "from productos as p " +
                                                  "order by p.votos desc " +
                                                  "limit 5");
        return consulta.getResultList();
    }
    
    @GetMapping("/compras/queMasCompran")
    public List<Object[]> listarClientesQueMasCompran() {
        Query consulta = entity.createNativeQuery("select u.nombre, u.apellido, " +
                                                  "count(c.cliente_id) as numeroCompras " +
                                                  "from usuarios as u, compras as c " +
                                                  "where u.correo = c.cliente_id " +
                                                  "group by u.nombre, u.apellido " +
                                                  "order by numeroCompras desc " +
                                                  "limit 5");
        return consulta.getResultList();
    }
    
    @GetMapping("/compras/comprados/{correo}")
    public List<Object[]> listarComprasDelCliente(@PathVariable("correo") String correo) {
        Query consulta = entity.createNativeQuery("select distinct p.imagen, p.descripcion, c.cantidad, " +
                                                  "p.precio, c.cantidad * p.precio " +
                                                  "from productos as p, compras as c " +
                                                  "where c.cliente_id = '" + correo + ".' " +
                                                  "and c.producto_id = p.id");
        return consulta.getResultList();
    }
}