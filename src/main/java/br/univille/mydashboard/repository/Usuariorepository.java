package br.univille.mydashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.mydashboard.entity.Usuario;

@Repository
public interface Usuariorepository
    extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
    Usuario findByEmailAndSenha(String email, String senha);
}
