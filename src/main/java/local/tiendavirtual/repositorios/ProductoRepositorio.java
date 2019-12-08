package local.tiendavirtual.repositorios;

import java.util.List;
import local.tiendavirtual.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    
    @Override
    public List<Producto> findAll();
}
