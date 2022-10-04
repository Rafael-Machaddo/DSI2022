package br.univille.mydashboard.mapper;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.entity.Allowlist;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-03T23:37:58-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
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

        allowlistDTO.setFormulario2( allowlist.getFormulario2() );
        allowlistDTO.setFormulario3( allowlist.getFormulario3() );
        allowlistDTO.setFormulario4( allowlist.getFormulario4() );
        allowlistDTO.setId( allowlist.getId() );
        allowlistDTO.setNome( allowlist.getNome() );
        allowlistDTO.setTelefone( allowlist.getTelefone() );
        allowlistDTO.setUsuario( allowlist.getUsuario() );

        return allowlistDTO;
    }

    @Override
    public Allowlist mapAllowlistDTO(AllowlistDTO allowlist) {
        if ( allowlist == null ) {
            return null;
        }

        Allowlist allowlist1 = new Allowlist();

        allowlist1.setFormulario1( allowlist.getFormulario1() );
        allowlist1.setFormulario2( allowlist.getFormulario2() );
        allowlist1.setFormulario3( allowlist.getFormulario3() );
        allowlist1.setFormulario4( allowlist.getFormulario4() );
        allowlist1.setId( allowlist.getId() );
        allowlist1.setNome( allowlist.getNome() );
        allowlist1.setTelefone( allowlist.getTelefone() );
        allowlist1.setUsuario( allowlist.getUsuario() );

        return allowlist1;
    }
}
