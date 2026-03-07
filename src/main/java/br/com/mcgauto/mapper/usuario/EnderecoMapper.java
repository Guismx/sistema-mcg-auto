package br.com.mcgauto.mapper.usuario;

import br.com.mcgauto.domain.usuario.Endereco;
import br.com.mcgauto.dto.usuario.EnderecoCreateRequestDTO;
import br.com.mcgauto.dto.usuario.EnderecoResponseDTO;
import br.com.mcgauto.dto.usuario.EnderecoUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper {

    Endereco toEndereco(EnderecoCreateRequestDTO dto);

    EnderecoResponseDTO toResponseDTO(Endereco endereco);

    void updateEndereco(EnderecoUpdateRequestDTO dto, @MappingTarget Endereco endereco);

    List<EnderecoResponseDTO> toResponseDTOList(List<Endereco> enderecos);
}
