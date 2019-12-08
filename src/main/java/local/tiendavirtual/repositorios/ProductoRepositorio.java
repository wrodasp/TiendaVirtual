package local.tiendavirtual.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import local.tiendavirtual.modelos.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    
    @Override
    public List<Producto> findAll();
}
