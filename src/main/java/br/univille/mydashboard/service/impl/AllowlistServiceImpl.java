package br.univille.mydashboard.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.entity.Allowlist;
import br.univille.mydashboard.mapper.AllowlistMapper;
import br.univille.mydashboard.repository.Allowlistrepository;
import br.univille.mydashboard.service.AllowlistService;

@Service
public class AllowlistServiceImpl implements AllowlistService{
    
    @Autowired
    private Allowlistrepository repository;
    private AllowlistMapper mapper
            = Mappers.getMapper(AllowlistMapper.class); 

    @Override
    public AllowlistDTO save(AllowlistDTO allowlist) {
        Allowlist allowlistentity = mapper.mapAllowlistDTO(allowlist);
        repository.save(allowlistentity);
        return mapper.mapAllowlist(allowlistentity);
    }

    @Override
    public List<AllowlistDTO> getAll() {
        return mapper.mapAllowlist(repository.findAll());
    }
    
    @Override
    public AllowlistDTO findByID(long id) {
        Optional<Allowlist> allowlist = repository.findById(id);
        if(allowlist.isPresent()){
            Allowlist allowlistentity = allowlist.get();
            return mapper.mapAllowlist(allowlistentity);
        }
        return new AllowlistDTO();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }

}
