package br.univille.mydashboard.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mydashboard.dto.UsuarioDTO;
import br.univille.mydashboard.entity.Usuario;
import br.univille.mydashboard.mapper.UsuarioMapper;
import br.univille.mydashboard.repository.Usuariorepository;
import br.univille.mydashboard.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private Usuariorepository repository;
    private UsuarioMapper mapper
            = Mappers.getMapper(UsuarioMapper.class); 

    @Override
    public UsuarioDTO save(UsuarioDTO usuario) {
        Usuario usuarioentity = mapper.mapUsuarioDTO(usuario);
        repository.save(usuarioentity);
        return mapper.mapUsuario(usuarioentity);
    }

    @Override
    public List<UsuarioDTO> getAll() {
        return mapper.mapUsuario(repository.findAll());
    }

    @Override
    public UsuarioDTO findByID(long id) {
        Optional<Usuario> usuario = repository.findById(id);
        if(usuario.isPresent()){
            Usuario usuarioentity = usuario.get();
            return mapper.mapUsuario(usuarioentity);
        }
        return new UsuarioDTO();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }

}
