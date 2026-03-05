package br.com.mcgauto.mapper.servico;

import br.com.mcgauto.domain.servico.Servico;
import br.com.mcgauto.dto.servico.ServicoRequestDTO;
import br.com.mcgauto.dto.servico.ServicoResponseDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface ServicoMapper {

    Servico toEntity(ServicoRequestDTO dto);
    ServicoResponseDTO toResponseDTO(Servico servico);
}
