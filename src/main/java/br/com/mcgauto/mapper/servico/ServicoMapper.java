package br.com.mcgauto.mapper.servico;

import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.dto.servico.ServicoRequestDTO;
import br.com.mcgauto.dto.servico.ServicoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServicoMapper {

    Servico toEntity(ServicoRequestDTO dto);

    ServicoResponseDTO toResponseDTO(Servico servico);

    List<ServicoResponseDTO> toResponseDTOList(List<Servico> servicos);

    void updateEntityFromDTO(ServicoRequestDTO dto, @MappingTarget Servico servico);
}
