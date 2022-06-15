package br.univille.mydashboard.service;

import java.util.List;

import br.univille.mydashboard.dto.UsuarioDTO;

public interface UsuarioService {
    public List<UsuarioDTO> getAll();
    public UsuarioDTO save(UsuarioDTO usuario);
    public UsuarioDTO findByID(long id);
    public void delete(long id);
}
