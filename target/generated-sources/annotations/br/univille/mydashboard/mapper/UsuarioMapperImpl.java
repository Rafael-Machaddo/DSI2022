package br.univille.mydashboard.mapper;

import br.univille.mydashboard.dto.UsuarioDTO;
import br.univille.mydashboard.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-04T19:19:26-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public List<UsuarioDTO> mapUsuario(List<Usuario> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( usuario.size() );
        for ( Usuario usuario1 : usuario ) {
            list.add( mapUsuario( usuario1 ) );
        }

        return list;
    }

    @Override
    public List<Usuario> mapUsuarioDTO(List<UsuarioDTO> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( usuario.size() );
        for ( UsuarioDTO usuarioDTO : usuario ) {
            list.add( mapUsuarioDTO( usuarioDTO ) );
        }

        return list;
    }

    @Override
    public UsuarioDTO mapUsuario(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setNome( usuario.getNome() );
        usuarioDTO.setEmail( usuario.getEmail() );
        usuarioDTO.setSexo( usuario.getSexo() );
        usuarioDTO.setTelefone( usuario.getTelefone() );
        usuarioDTO.setNascimento( usuario.getNascimento() );
        usuarioDTO.setSenha( usuario.getSenha() );

        return usuarioDTO;
    }

    @Override
    public Usuario mapUsuarioDTO(UsuarioDTO usuario) {
        if ( usuario == null ) {
            return null;
        }

        Usuario usuario1 = new Usuario();

        usuario1.setTelefone( usuario.getTelefone() );
        usuario1.setId( usuario.getId() );
        usuario1.setNome( usuario.getNome() );
        usuario1.setEmail( usuario.getEmail() );
        usuario1.setSexo( usuario.getSexo() );
        usuario1.setNascimento( usuario.getNascimento() );
        usuario1.setSenha( usuario.getSenha() );

        return usuario1;
    }
}
