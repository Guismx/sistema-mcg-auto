package br.com.mcgauto.mapper.usuario;

import br.com.mcgauto.domain.usuario.Cnh;
import br.com.mcgauto.dto.usuario.CnhCreateRequestDTO;
import br.com.mcgauto.dto.usuario.CnhResponseDTO;
import br.com.mcgauto.dto.usuario.CnhUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CnhMapper {

    Cnh toCnh(CnhCreateRequestDTO dto);

    CnhResponseDTO toResponseDTO(Cnh cnh);

    void updateCnh(CnhUpdateRequestDTO dto, @MappingTarget Cnh cnh);
}
