package dev.sistemadecadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sistemadecadastro.entities.Usuario;
import dev.sistemadecadastro.services.UsuarioServiuce;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServiuce servise;

	@GetMapping
	public List<Usuario> procuraTodos() {
		return servise.procuraTodos();
	}

	@GetMapping(value = "/{id}")
	public Usuario procuraPorId(@PathVariable Integer id) {
		return servise.procuraPorId(id);
	}
	
    @PostMapping
    public String adicionaUsuario(@RequestBody Usuario usuario) {
        String response = servise.adicionaUsuario(usuario);
        return response;
    }

    @PutMapping(value = "/{id}")
    public String editarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        String response = servise.editarUsuario(id, usuario);
        return response;
    }


	@DeleteMapping(value = "/{id}")
	public void excluirUsuario(@PathVariable Integer id) {
		servise.excluirUsuario(id);
	}

}
