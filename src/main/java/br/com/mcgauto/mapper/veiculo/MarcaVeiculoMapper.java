package br.com.mcgauto.mapper.veiculo;

import br.com.mcgauto.domain.veiculo.MarcaVeiculo;
import br.com.mcgauto.dto.veiculo.MarcaVeiculoCreateRequestDTO;
import br.com.mcgauto.dto.veiculo.MarcaVeiculoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarcaVeiculoMapper {

    MarcaVeiculo toEntity(MarcaVeiculoCreateRequestDTO dto);

    MarcaVeiculoResponseDTO toResponseDTO(MarcaVeiculo entity);

    List<MarcaVeiculoResponseDTO> toResponseDTOList(List<MarcaVeiculo> entities);
}