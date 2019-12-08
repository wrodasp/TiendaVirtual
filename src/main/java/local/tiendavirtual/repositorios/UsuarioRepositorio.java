package local.tiendavirtual.repositorios;

import java.util.List;
import local.tiendavirtual.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    
    @Override
    public List<Usuario> findAll();
}