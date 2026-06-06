package dev.sistemadecadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sistemadecadastro.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
