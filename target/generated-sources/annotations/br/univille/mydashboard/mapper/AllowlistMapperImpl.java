package br.univille.mydashboard.mapper;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.entity.Allowlist;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-20T20:58:28-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
public class AllowlistMapperImpl implements AllowlistMapper {

    @Override
    public List<AllowlistDTO> mapAllowlist(List<Allowlist> allowlist) {
        if ( allowlist == null ) {
            return null;
        }

        List<AllowlistDTO> list = new ArrayList<AllowlistDTO>( allowlist.size() );
        for ( Allowlist allowlist1 : allowlist ) {
            list.add( mapAllowlist( allowlist1 ) );
        }

        return list;
    }

    @Override
    public List<Allowlist> mapAllowlistDTO(List<AllowlistDTO> allowlist) {
        if ( allowlist == null ) {
            return null;
        }

        List<Allowlist> list = new ArrayList<Allowlist>( allowlist.size() );
        for ( AllowlistDTO allowlistDTO : allowlist ) {
            list.add( mapAllowlistDTO( allowlistDTO ) );
        }

        return list;
    }

    @Override
    public AllowlistDTO mapAllowlist(Allowlist allowlist) {
        if ( allowlist == null ) {
            return null;
        }

        AllowlistDTO allowlistDTO = new AllowlistDTO();

        allowlistDTO.setUsuario( allowlist.getUsuario() );
        allowlistDTO.setId( allowlist.getId() );
        allowlistDTO.setNome( allowlist.getNome() );
        allowlistDTO.setTelefone( allowlist.getTelefone() );
        allowlistDTO.setFormulario( allowlist.getFormulario() );

        return allowlistDTO;
    }

    @Override
    public Allowlist mapAllowlistDTO(AllowlistDTO allowlist) {
        if ( allowlist == null ) {
            return null;
        }

        Allowlist allowlist1 = new Allowlist();

        allowlist1.setUsuario( allowlist.getUsuario() );
        allowlist1.setId( allowlist.getId() );
        allowlist1.setNome( allowlist.getNome() );
        allowlist1.setTelefone( allowlist.getTelefone() );

        return allowlist1;
    }
}
