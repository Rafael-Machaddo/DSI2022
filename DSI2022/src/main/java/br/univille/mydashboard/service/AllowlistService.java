package br.univille.mydashboard.service;

import java.util.List;

import br.univille.mydashboard.dto.AllowlistDTO;

public interface AllowlistService {
    public List<AllowlistDTO> getAll();
    public AllowlistDTO save(AllowlistDTO allowlist);
    public AllowlistDTO findByID(long id);
    public void delete(long id);
}
