package br.univille.mydashboard.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.entity.Allowlist;

@Mapper
public interface AllowlistMapper {
    List<AllowlistDTO> mapAllowlist(List<Allowlist> allowlist);
    List<Allowlist> mapAllowlistDTO(List<AllowlistDTO> allowlist);
    AllowlistDTO mapAllowlist(Allowlist allowlist);
    Allowlist mapAllowlistDTO(AllowlistDTO allowlist);
}
