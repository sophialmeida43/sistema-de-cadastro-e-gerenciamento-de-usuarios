package dev.sistemadecadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sistemadecadastro.entities.Usuario;
import dev.sistemadecadastro.exceptions.NaoEncontradoException;
import dev.sistemadecadastro.repositories.UsuarioRepository;

@Service
public class UsuarioServiuce {

	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> procuraTodos() {
		return repository.findAll();
	}

	public Usuario procuraPorId(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new NaoEncontradoException("ID inválido! Usuário não encontrado."));
	}

	public String adicionaUsuario(Usuario usuario) {
		Usuario salvo = repository.save(usuario);
		return "Usuario adicionado com sucesso!";
	}

	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();

		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());

		repository.save(response);
		return "Usuario editado com sucesso!";

	}

	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}

}
