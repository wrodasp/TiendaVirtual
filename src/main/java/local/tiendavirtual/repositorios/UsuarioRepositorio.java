package local.tiendavirtual.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import local.tiendavirtual.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
		@Override
	    public List<Usuario> findAll();
}
