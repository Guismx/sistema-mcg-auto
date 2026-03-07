package br.com.mcgauto.mapper.usuario;

import br.com.mcgauto.domain.usuario.Usuario;
import br.com.mcgauto.dto.usuario.UsuarioCreateRequestDTO;
import br.com.mcgauto.dto.usuario.UsuarioResponseDTO;
import br.com.mcgauto.dto.usuario.UsuarioUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CnhMapper.class, EnderecoMapper.class})
public interface UsuarioMapper {

    Usuario toUsuario(UsuarioCreateRequestDTO dto);

    UsuarioResponseDTO toResponseDTO(Usuario usuario);

    void updateUsuario(UsuarioUpdateRequestDTO dto, @MappingTarget Usuario usuario);

    List<UsuarioResponseDTO> toResponseDTOList(List<Usuario> usuarios);
}
