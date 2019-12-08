package local.tiendavirtual.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import local.tiendavirtual.modelos.Usuario;
import local.tiendavirtual.repositorios.UsuarioRepositorio;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class ControladorUsuario {
	@Autowired
	private UsuarioRepositorio repositorio;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
		return repositorio.findAll();
	}

	@GetMapping("/usuarios/{id}")
	public Usuario buscar(@PathVariable(value = "id") int id) {
		return null;
	}
}
