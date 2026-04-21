package br.com.mcgauto.mapper.veiculo;

import br.com.mcgauto.domain.veiculo.Veiculo;
import br.com.mcgauto.dto.veiculo.VeiculoCreateRequestDTO;
import br.com.mcgauto.dto.veiculo.VeiculoResponseDTO;
import br.com.mcgauto.dto.veiculo.VeiculoUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ModeloVeiculoMapper.class})
public interface VeiculoMapper {

    Veiculo toEntity(VeiculoCreateRequestDTO dto);

    VeiculoResponseDTO toResponseDTO(Veiculo entity);

    List<VeiculoResponseDTO> toResponseDTOList(List<Veiculo> entities);

    //Método crucial para o verbo PUT da API
    void updateEntityFromDTO(VeiculoUpdateRequestDTO dto, @MappingTarget Veiculo entity);
}