package local.tiendavirtual.repositorios;

import java.util.List;
import local.tiendavirtual.modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {
    @Override
    public List<Categoria> findAll();
}