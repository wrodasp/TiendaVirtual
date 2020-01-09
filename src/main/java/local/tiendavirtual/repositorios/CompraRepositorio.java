package local.tiendavirtual.repositorios;

import java.util.List;
import local.tiendavirtual.modelos.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepositorio extends JpaRepository<Compra, Integer>{
    
    @Override
    public List<Compra> findAll();
}
