package br.univille.mydashboard.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.univille.mydashboard.dto.UsuarioDTO;
import br.univille.mydashboard.entity.Usuario;

@Mapper
public interface UsuarioMapper {
    List<UsuarioDTO> mapUsuario(List<Usuario> usuario);
    List<Usuario> mapUsuarioDTO(List<UsuarioDTO> usuario);
    UsuarioDTO mapUsuario(Usuario usuario);
    Usuario mapUsuarioDTO(UsuarioDTO usuario);
}
