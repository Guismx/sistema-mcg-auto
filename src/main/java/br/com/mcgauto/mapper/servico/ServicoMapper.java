package br.com.mcgauto.mapper.servico;

import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.dto.servico.ServicoCreateRequestDTO;
import br.com.mcgauto.dto.servico.ServicoResponseDTO;
import br.com.mcgauto.dto.servico.ServicoUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServicoMapper {

    Servico toEntity(ServicoCreateRequestDTO dto);

    ServicoResponseDTO toResponseDTO(Servico servico);

    List<ServicoResponseDTO> toResponseDTOList(List<Servico> servicos);

    void updateEntityFromDTO(ServicoUpdateRequestDTO dto, @MappingTarget Servico servico);
}
