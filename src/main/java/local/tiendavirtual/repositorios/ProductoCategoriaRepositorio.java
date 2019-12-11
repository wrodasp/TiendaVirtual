package local.tiendavirtual.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import local.tiendavirtual.modelos.ProductoCategoria;

public interface ProductoCategoriaRepositorio extends JpaRepository<ProductoCategoria, Integer> {
	@Override
	public List<ProductoCategoria> findAll();
}
